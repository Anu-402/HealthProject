package com.cg;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.hcs.dao.TestDao;
import com.cg.hcs.entity.HealthTest;
import com.cg.hcs.exception.TestException;
import com.cg.hcs.service.TestService;
@SpringBootTest
class HealthCareSystemApplicationTests {

	 @Autowired 
	 private TestService testService;
	 @MockBean
	private TestDao testDao;
		
	@Test
	void contextLoads() {
	}

		
	@Test
	public void HealthTest() throws TestException{
		when(testDao.findAll()).thenReturn(Stream.of(new HealthTest(1179,"Bloodgroup",null),new HealthTest(1180,"Bloodpressure",null)).collect(Collectors.toList()));
		assertEquals(2,testService.findAllTests().size());
		}
			

	
		
}
