package com.example.receipeprojectspring.mapper;

import com.example.receipeprojectspring.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestDTO> getUserList();
}