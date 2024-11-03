package cn.itcast.feign.clients.fallback;

import cn.itcast.feign.clients.UserClient;
import com.wang.pojo.RUser;

public class UserClientsFallback implements UserClient {
    @Override
    public RUser findById() {
        return null;
    }
}
