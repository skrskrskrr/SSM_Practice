package com.serviceImp;

import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pojo.User;
import com.service.UserService;

import java.util.List;

@Service
public class UserServieImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> selectall() {

        List<User> users=userMapper.selectall();
        System.out.println(users);
        return null;
    }
}
