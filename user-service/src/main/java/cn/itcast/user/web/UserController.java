package cn.itcast.user.web;

import cn.itcast.user.config.MinioConfig;
import cn.itcast.user.config.MinioUtil;
import cn.itcast.user.config.PatternProperties;
import cn.itcast.user.service.UserService;
import com.google.protobuf.Api;
import com.wang.pojo.RUser;
import com.wang.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
// @RefreshScope
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private MinioUtil minioUtil;

    @Resource
    private MinioConfig minioConfig;

    @Resource
    private PatternProperties properties;

    @Value("${spring.datasource.username}")
    private String username;

    @Value(value = "${spring.datasource.password}")
    private String password;

    @Value(value = "${spring.datasource.url}")
    private String url;

    @GetMapping("prop")
    public PatternProperties properties(){
        return properties;
    }

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
    }

    /**
     * 路径： /user/110
     *
     * @return 用户
     */
    @GetMapping("/getValue")
    public String[] queryById() {
        return new String[]{username,password,url};
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ApiResponse<List<RUser>> getAllUsers(){
        List<RUser> allUsers = userService.getAllUsers();
        return ApiResponse.success("ok",allUsers);
    }
    @GetMapping("/send")
    public String sendMessage(@RequestBody RUser rUser){
        userService.SendMessage(rUser);
        return "message:"+rUser;
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public ApiResponse<String>uploadFIle(@RequestParam("file")MultipartFile file){
        String filename = file.getOriginalFilename();
        String newFileName = System.currentTimeMillis() + "." + StringUtils.substringAfterLast(filename, ".");
        String contentType = file.getContentType();
        minioUtil.uploadFile(minioConfig.getBucketName(),file,newFileName,contentType);
        return ApiResponse.success("success",)

    }

    @RequestMapping(value = "/download",method = RequestMethod.GET)
    public ApiResponse<InputStream>downloadFile(@RequestParam("fileName")String fileName){

    }

}
