package com.codingrecipe.member.entity;


import com.codingrecipe.member.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Member;

@Entity
@Setter
@Getter
@Table(name="person_table")

public class MemberEntity {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Long personID;

    @Column
    private String personPassword;

    @Column
    private String personName;



}
