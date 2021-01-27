package com.example.ehcache1.service;

import com.example.ehcache1.domain.User;

public interface UserService {

    User findById(int id);

    User save(int id);

    User update(int id);

}
