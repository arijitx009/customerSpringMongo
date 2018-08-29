package com.example.customerBoot1;

import org.springframework.http.MediaType;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.customerBoot1.customerService.customerService;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest
public class CustomerBoot1ApplicationTests {
	
	@Autowired
	
	private MockMvc mockMvc;
	@MockBean
	private customerService cs;

	@Test
	public void contextLoads() throws Exception {
		
		
		Mockito.when(cs.getAllNames()).thenReturn(Collections.emptyList());
		
		MvcResult mvcResult=mockMvc.perform(
				MockMvcRequestBuilders.get("/customer")
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		
		Mockito.verify(cs.getAllNames());
						
		
		
		
		
		
	}

}
