package me.shawn.study.rdb.member;

import me.shawn.study.rdb.mapper.MemberMapper;
import me.shawn.study.rdb.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private MemberMapper memberDao;

    public MemberService(MemberMapper memberDao) {
        this.memberDao = memberDao;
    }

    List<Member> getAllMembers() {
        return memberDao.selectAllMembers();
    }
    List<Member> getMembersByCondition(Member condition) {
        return memberDao.selectMembersByCondition(condition);
    }

    Member getMemberById(Long id) {
        return memberDao.selectMemberById(id);
    }

    Member addMember(Member memberDto) {
        memberDao.insertMember(memberDto);
        return memberDao.selectMemberById(memberDto.getId());
    }
}
