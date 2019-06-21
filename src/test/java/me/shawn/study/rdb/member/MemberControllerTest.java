package me.shawn.study.rdb.member;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.shawn.study.rdb.model.Member;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void hello() throws Exception {
        // GIVEN
        String name = "shawn";

        // WHEN
        mockMvc.perform(get("/members/hello").param("name", name))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(String.format("Hello, %s!", name)));


        // THEN
    }


    @Test
    public void getAllMembers() throws Exception {
        // GIVEN

        // WHEN
        mockMvc.perform(get("/members"))
                .andDo(print())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].id").exists())
                .andExpect(status().isOk());

        // THEN
    }

//    @Ignore
    @Test
    public void getMemberById() throws Exception {
        // GIVEN

        // WHEN
        mockMvc.perform(get("/members/1"))
                .andDo(print())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(status().isOk());

        // THEN
    }

//    @Ignore
    @Test
    public void addMember() throws Exception {
        // GIVEN
        String membername = "조냉면";
        Member member = Member.builder()
                .name(membername)
                .age(23)
                .email("coldnoodle@ttt.com")
                .phoneNumber("0001112345")
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String memberJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(member);
        System.out.println("memberJson => " + memberJson);

        // WHEN
        mockMvc.perform(post("/members").content(memberJson)
                    .characterEncoding("UTF-8")
                    .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").value(membername))
                .andExpect(status().isOk());

        // THEN
    }
}