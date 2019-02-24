package vip.anjun.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.anjun.db.dao.UserMapper;
import vip.anjun.db.domain.User;


public interface UserService {
    int add(User u);
    User selectByPrimaryKey(Long id);
}
