package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.domain.Student;
import demo.domain.service.StudentService;

@Controller
public class HManyToManyController
{
	@Autowired
	private StudentService stdService;
	
	@RequestMapping("/")
	public String index()
	{
		Student s=new Student();
		s.setName("Tom");
		s.setDept("Tom Dept");
		stdService.createStudent(s);
		
		return "index";
	}
}
