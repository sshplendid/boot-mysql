package me.shawn.study.rdb.member;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class MemberDto {
    private String name;
    private Integer age;
}
