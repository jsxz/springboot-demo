package vip.anjun.mybatis_two.db1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.anjun.mybatis_two.db1.dao.UserDao;
import vip.anjun.mybatis_two.domain.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据名字查找用户
     */
    public User selectUserByName(String name) {
        return userDao.findUserByName(name);
    }

}
