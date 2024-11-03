package cn.itcast.feign.clients;

import cn.itcast.feign.clients.fallback.UserClientsFallback;
import com.wang.pojo.RUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "userservice",fallback = UserClientsFallback.class)
public interface UserClient {

    @GetMapping("/user/getAll")
    RUser findById();
}
