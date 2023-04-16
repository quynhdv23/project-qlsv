package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "USER_ADMIN")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class UserAdmin {
    @Id
    @Column(name = "USER_ADMIN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer USER_ADMIN_ID;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "email")
    private String email;
}
