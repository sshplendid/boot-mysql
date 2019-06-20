package me.shawn.study.rdb.member;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberControllerTest {

    MockMvc mockMvc;

    @Before
    public void setUp() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup()
    }

    @Test
    public void hello() {
        // GIVEN

        // WHEN


        // THEN
    }


    @Test
    public void getAllMembers() {
        // GIVEN

        // WHEN

        // THEN
    }

    @Ignore
    @Test
    public void getMemberById() {
        // GIVEN

        // WHEN

        // THEN
    }

    @Ignore
    @Test
    public void addMember() {
        // GIVEN

        // WHEN

        // THEN
    }
}