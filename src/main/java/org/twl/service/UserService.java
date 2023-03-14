package org.twl.service;

import org.apache.ibatis.annotations.Param;
import org.twl.bean.User;

import java.util.List;

public interface UserService {
    User findUserByMobileNumber(String mobileNumber);

    List<User> findAllUserByPaging(int pageIndex, int pageSize);

    int insertUser(User user);
}
