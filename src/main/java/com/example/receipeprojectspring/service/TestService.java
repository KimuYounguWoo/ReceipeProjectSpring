package com.example.receipeprojectspring.service;

import com.example.receipeprojectspring.dto.TestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {
    public List<TestDTO> getUserList();
    public void passwdReset();
}