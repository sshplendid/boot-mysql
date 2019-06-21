package me.shawn.study.rdb.member;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.shawn.study.rdb.model.Member;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private MemberService memberService;

    @Autowired
    private ModelMapper modelMapper;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "world") String name) {
        return String.format("Hello, %s!", name);
    }

    @GetMapping
    public List<Member> getMembersByCondition(MemberDto dto) {
        Member condition = new Member();
        modelMapper.map(dto, condition);
        return memberService.getMembersByCondition(condition);
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    @PostMapping
    public Member addMember(@RequestBody Member memberDto) {
        return memberService.addMember(memberDto);
    }
}
