package com.example.receipeprojectspring.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.receipeprojectspring.dto.UserDTO;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDTO> getUserList();
    void register(UserDTO params);
    UserDTO passwdReset(int USER_SEQ);
    List<UserDTO> findAll();
    int count();
}