package com.example.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
public class User {
    @Id
    @Column(name ="user_no")
    private long userNo;

    @Column(name = "user_id")
    private String userId;

    private String password;

    @Column(name = "tel_no")
    private String telNo;

    private String email;

    @Column(name = "sbsc_date")
    private Date sbscDate;

    @Column(name = "trmn_date")
    private Date trmnDate;
}
