package com.example.receipeprojectspring.controller;

import com.example.receipeprojectspring.dto.UserDTO;
import com.example.receipeprojectspring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController                         //controller임을 명시
@RequiredArgsConstructor                //final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
/* @ResponeseBody -> HTML이 아닌 데이터 리턴 */
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        return "Hello World!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<UserDTO> getUser() {
        return userService.getUserList();
    }

}