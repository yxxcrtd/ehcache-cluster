package com.example.ehcache1.service.impl;

import com.example.ehcache1.domain.User;
import com.example.ehcache1.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @Cacheable(value = "users", key = "'user_' + #id")
    public User findById(int id) {
        logger.debug("====getUserById====" + id);
        return saveUser(id);
    }

    @Override
    @CacheEvict(value = "users", key = "'user'")
    public User save(int id) {
        return saveUser(id);
    }

    @Override
    @CachePut(value = "users", key = "'user_' + #id")
    public User update(int id) {
        return saveUser(id);
    }

    private User saveUser(int id) {
        User user = new User();
        user.setId(id);
        user.setUsername(UUID.randomUUID().toString());
        return user;
    }

}
