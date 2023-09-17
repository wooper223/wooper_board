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
public class userController {
    private final UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody UserVo userVo){
        System.out.println(userVo.getUserId());
        return userService.insertUser(userVo);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginVo loginVo){
        return userService.login(loginVo);
    }

    @GetMapping("/allUserInfo")
    public String allUserInfo(){
        return userService.getAllUserInfo();
    }
}
