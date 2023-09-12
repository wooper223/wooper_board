package com.example.board.controller;

import com.example.board.service.UserService;
import com.example.board.vo.LoginVo;
import com.example.board.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody UserVo userVo){
        userService.insertUser(userVo);
        return "";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginVo loginVo){

        return "";
    }

    @GetMapping("/userInfo")
    public String userInfo(String userId){

        return "";
    }
}
