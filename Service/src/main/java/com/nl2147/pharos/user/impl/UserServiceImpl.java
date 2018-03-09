package com.nl2147.pharos.user.impl;

import com.nl2147.pharos.common.impl.BaseService;
import com.nl2147.pharos.user.UserService;
import com.nl2147.pharos.user.bean.User;
import com.nl2147.pharos.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl extends BaseService<User> implements UserService {

    //private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;


}
