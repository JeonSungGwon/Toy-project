package com.example.Toy_project.dto;

import com.example.Toy_project.entity.Authority;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDto {
    private Long id;
    private String email;
    private String name;
    private String gender;
    private LocalDate gymMembershipStart;
    private LocalDate gymMembershipEnd;
    private String ptSubscription;
    private Authority authority;

    @Builder
    public MemberDto(Long id, String email, String name, Authority authority) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.authority = authority;
    }
}
