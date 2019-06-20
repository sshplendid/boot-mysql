package me.shawn.study.rdb.mapper;

import me.shawn.study.rdb.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    Member selectMemberById(Long id);
    List<Member> selectAllMembers();
    List<Member> selectMembersByCondition(Member condition);
    void insertMember(Member member);
}
