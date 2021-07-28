package com.stakater.task.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(value = HelloController.class)
public class HelloControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void helloWorld_basic() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/api/v1/hello").accept(MediaType.APPLICATION_JSON);
		MvcResult result= mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Vinay!"))
				.andReturn();
		assertEquals("Hello Vinay!", result.getResponse().getContentAsString());
	}

}
