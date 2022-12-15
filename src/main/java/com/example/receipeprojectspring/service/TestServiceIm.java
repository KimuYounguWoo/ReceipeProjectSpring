package com.example.receipeprojectspring.service;

import com.example.receipeprojectspring.dto.TestDTO;
import com.example.receipeprojectspring.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceIm implements TestService {

    private final TestMapper testMapper;

    @Override
    public List<TestDTO> getUserList() {
        return testMapper.getUserList();
    }
    public void passwdReset() {
        testMapper.getUserList().get(3);
    }
}