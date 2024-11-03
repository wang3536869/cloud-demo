package cn.itcast.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.pojo.RUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<RUser> {

    RUser findById(String username);

    List<RUser>getAllUsers();
}