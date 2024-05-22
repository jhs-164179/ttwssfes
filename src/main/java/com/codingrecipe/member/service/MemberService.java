package com.codingrecipe.member.service;

import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.entity.MemberEntity;
import com.codingrecipe.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    // 생성자 주입
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        //repository의 save 메서드 호출 (조건.entity 객체를 넘겨줘야함)
        //1. dto객체를 entity객체로 변환
        //2. repository의 save 메서드를 호출
      //  MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
      //  memberRepository.save(memberEntity);
    }
}
