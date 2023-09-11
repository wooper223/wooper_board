package com.example.board.service;

import com.example.board.entity.User;
import com.example.board.repository.UserRepository;
import com.example.board.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
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
            /*User newUser = new User(1, userVo.getUser_id(), userVo.getPassword()
            , userVo.getTel_no(), userVo.getEmail(), LocalDate.now().toString());
            userRepository.save();*/
            return "Success";
        }
    }

//    public Long findByUserId(String userId){
//        userRepository.findByUserId(userId);
//    }
}
