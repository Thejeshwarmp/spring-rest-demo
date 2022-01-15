package com.example.service;

import com.example.domain.entity.User;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User findUserById(Integer id) {
        return userRepo.findById(id).orElseGet(User::new);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void saveUserInfo(User userInfo) {

        userRepo.save(userInfo);
    }

    @Override
    public void deleteById(Integer id) {

        userRepo.deleteById(id);
    }

    @Override
    public void deleteAll() {
        userRepo.deleteAll();
    }
}
