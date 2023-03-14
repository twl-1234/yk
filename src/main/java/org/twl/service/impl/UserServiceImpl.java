package org.twl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.twl.bean.User;
import org.twl.dao.UserDao;
import org.twl.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findUserByMobileNumber(String mobileNumber) {
        return userDao.findUserByMobileNumber(mobileNumber);
    }

    @Override
    public List<User> findAllUserByPaging(int pageIndex, int pageSize) {
        return userDao.findAllUserByPaging((pageIndex-1)*pageSize,pageSize);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
