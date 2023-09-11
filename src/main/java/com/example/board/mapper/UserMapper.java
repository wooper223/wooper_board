package com.example.board.mapper;

import com.example.board.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {

    //pΩΩΩrivae final SqlSession sqlSessionTemplate;
    //@Select("Select * from user where user_id = #{userID}")
    public Optional<User> findByUserId(String userID);
}
