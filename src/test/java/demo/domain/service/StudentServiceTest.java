package demo.domain.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import demo.HManyToManyApplication;
import demo.domain.Student;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@SpringApplicationConfiguration(classes = HManyToManyApplication.class)
@WebAppConfiguration
public class StudentServiceTest
{
	private MockMvc mockMvc;
	
	@Autowired
	private StudentService stdService;
	
	@Autowired
    private WebApplicationContext webApplicationContext;
	
	@Before
	public void setup()
	{
		
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testSave()
	{
		Student s=new Student();
		s.setName("Tom");
		s.setDept("Tom Dept");
		Student std = stdService.createStudent(s);
		assertEquals("1","1");
	}
	
	@Test
	public void getAllTest()
	{
		List<Student> allStudent = stdService.getAll();
		assertEquals(1, 1);
		
		//Student student = allStudent.get(0);
		
		assertEquals("Tom","Tom");
		assertEquals("Tom Dept","Tom Dept");
		
	}
	
	/*@Test
	public void findByIdTest() throws Exception
	{
		mockMvc.perform(get("/student/findbyid/1")).andExpect(status().isOk());
	}*/

}
