package cn.itcast.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.pojo.RUser;

import java.util.List;

public interface UserService extends IService<RUser> {

    RUser queryById(String username);

    List<RUser>getAllUsers();

    void SendMessage(RUser rUser);
}