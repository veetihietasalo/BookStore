package com.Bookstore.bookstore;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class BookControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void bookListShowsSeedBooks() throws Exception {
		mockMvc.perform(get("/bookStore"))
				.andExpect(status().isOk())
				.andExpect(view().name("bookStore"))
				.andExpect(content().string(containsString("<td>Book1</td>")))
				.andExpect(content().string(containsString("<td>Author1</td>")))
				.andExpect(content().string(containsString("<td>Book2</td>")));
	}

	@Test
	void rootShowsTheSameList() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("bookStore"));
	}

}
