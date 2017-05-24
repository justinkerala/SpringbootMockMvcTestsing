/**
 * @Project : spring-boot-cassandra-4
 * @Package : com.example
 * @fileName: resttesting.java
 * @Date    : May 24, 2017
 * @author  : justin */
package com.example;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author justin 
 *
 */
@RunWith(SpringRunner.class)
public class resttesting {

	@Autowired
    MockMvc mockMvc;
     
    @Autowired
    ObjectMapper objectMapper;

}
