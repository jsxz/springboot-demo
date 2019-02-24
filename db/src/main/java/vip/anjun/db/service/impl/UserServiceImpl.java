package vip.anjun.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.anjun.db.dao.UserMapper;
import vip.anjun.db.domain.User;
import vip.anjun.db.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User u) {
        return userMapper.insert(u);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

