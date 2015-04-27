package demo.domain.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.domain.Student;
import demo.domain.repo.StudentRepo;

@Service
@Component
public class StudentService
{
	@Resource
	public StudentRepo stdRepo;
	
	@Transactional
	public Student createStudent(Student stduent)
	{
		return stdRepo.save(stduent);
	}
	
	@Transactional
	public List<Student> getAll()
	{
		return stdRepo.findAll();
	}
	
	@Transactional
	public Student findByStdId(Integer stdId)
	{
		return stdRepo.findByStdId(stdId);
	}
}
