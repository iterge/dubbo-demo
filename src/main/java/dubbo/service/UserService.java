package dubbo.service;

import dubbo.entity.User;

/**
 * Created by Administrator on 2019/4/7.
 */
public interface UserService {
    User getUser(User user);
    String getStr();
}
