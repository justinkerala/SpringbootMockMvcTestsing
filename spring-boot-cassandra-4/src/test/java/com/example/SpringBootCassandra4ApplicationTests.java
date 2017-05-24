package com.example;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
   public class SpringBootCassandra4ApplicationTests {

//	@Autowired
//	private TestRestTemplate template;
//
//	@Test
//	public void contextLoads() throws Exception {
////		
// 		String headers = template.getForEntity("http://localhost:8078/greeting?name=justin", String.class).getBody();
//        
//// 		assertThat(page.getBody().getTextContent()).isEqualTo("Honda Civic");
//
// 		assertEquals(headers, "{\"id\":14,\"content\":\"Hello, justin!\"}");
//  	}
//	   
//
//

	@Autowired
	private MockMvc mockMvc;
 

	    @Test
	    public void testSayHelloWorld() throws Exception {
	    	   this.mockMvc.perform(get("/greeting").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
               .andExpect(status().isOk())
               .andDo(print())
               .andExpect(jsonPath("$.content", is("Hello, World!")))
               .andExpect(content().contentType("application/json;charset=UTF-8"));
	    }
	    
	 

	    @Test
	    public void testSayHelloWorld2() throws Exception {
	    	   this.mockMvc.perform(get("/greeting?name=justin").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
               .andExpect(status().isOk())
               .andDo(print())
               .andExpect(jsonPath("$.content", is("Hello, justin!")))
               .andExpect(content().contentType("application/json;charset=UTF-8"));
	    }
	    
}
 
	


 
