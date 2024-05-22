package com.codingrecipe.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MemberDTO {
    private Long personID;
    private String personPassword;
    private String personName;
}
