package com.example.receipeprojectspring.service;

import com.example.receipeprojectspring.mapper.UserMapper;
import com.example.receipeprojectspring.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceIm implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<UserDTO> getUserList() {
        return userMapper.getUserList();
    }
}