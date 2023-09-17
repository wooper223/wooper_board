package com.example.board.service;

import com.example.board.entity.User;
import com.example.board.repository.UserRepository;
import com.example.board.vo.LoginVo;
import com.example.board.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public String insertUser(UserVo userVo){
        Optional<User> user = userRepository.findByUserId(userVo.getUserId());
        if(user.isPresent()){
            return "Fail";
        } else {
            User newUser = new User(userVo.getUserId(), userVo.getPassword()
            , userVo.getTelNo(), userVo.getEmail(), LocalDateTime.now());
            userRepository.save(newUser);
            return "Success";
        }
    }

    public String login(LoginVo loginVo){
        Optional<User> user = userRepository.findByUserId(loginVo.getUserId());
        if(user.isPresent()){
            if(user.get().getPassword().equals(loginVo.getPassword()))
                return "Success";
            return "Fail : wrong password";
        }
        return "Fail : wrong id";
    }

    public String getAllUserInfo(){
        List<User> users = userRepository.findAll();
        String result = "";
        for(User user: users){
            result += user.toString() + '\n';
        }
        return result;
    }


}
