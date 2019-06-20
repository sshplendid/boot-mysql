package me.shawn.study.rdb.model;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Alias("member")
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    private Long id;
    private String name;
    private Integer age;
    private String phoneNumber;
    private String email;
}
