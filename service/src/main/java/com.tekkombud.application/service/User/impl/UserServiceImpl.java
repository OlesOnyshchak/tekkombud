package com.tekkombud.application.service.User.impl;

import com.tekkombud.application.dao.CRUDRepository;
import com.tekkombud.application.entity.User;
import com.tekkombud.application.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    CRUDRepository crudRepository;

    @Override
    public void saveUser(User user) {
        crudRepository.save(user);
    }
}
