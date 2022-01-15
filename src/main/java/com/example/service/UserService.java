package com.example.service;

import com.example.domain.entity.User;
import com.example.domain.request.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


   User findUserById(Integer id);

   List<User> findAll();

   void saveUserInfo(User userInfo);

   void deleteById(Integer id);

   void deleteAll();
}
