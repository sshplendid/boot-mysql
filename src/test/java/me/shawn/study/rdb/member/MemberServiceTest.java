package me.shawn.study.rdb.member;

import me.shawn.study.rdb.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
//@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService service;

    @Test
    public void getAllMembers() {
        List<Member> list = service.getAllMembers();
        assertThat(list.size()).isNotZero();
    }
}
