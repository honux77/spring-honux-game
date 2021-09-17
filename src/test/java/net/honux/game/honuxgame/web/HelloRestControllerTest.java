package net.honux.game.honuxgame.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class HelloRestControllerTest {

    @Autowired
    HelloRestController controller;
    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("컨트롤러 객체가 널이 아니어야 한다.")
    public void controllerNotNull() {
        assertThat(controller).isNotNull();
    }

    @Test
    @DisplayName("GET /hello 요청시 hello를 응답해야 한다.")
    public void helloController() throws Exception{
        String hello = "Hello honux";
        String url = "/hello?name=honux";
        mvc.perform(get(url))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
