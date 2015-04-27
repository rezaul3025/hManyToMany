package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Student;
import demo.domain.service.StudentService;

@RestController
@RequestMapping("/student")
public class HManyToManyRestController
{
	@Autowired
	private StudentService stdService;
	
	@RequestMapping(value="/findbyid/{stdId}", method = RequestMethod.GET)
	public Student findById(@PathVariable("stdId") Integer stdId)
	{
		
		return stdService.findByStdId(stdId);
	}
}
