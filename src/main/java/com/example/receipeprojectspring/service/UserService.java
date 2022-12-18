package com.example.receipeprojectspring.service;

import com.example.receipeprojectspring.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getUserList();
}