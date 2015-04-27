package demo.domain.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.domain.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{
	@SuppressWarnings("unchecked")
	Student save(Student stduent);
	
	List<Student> findAll();
	
	Student findByStdId(Integer stdId);
}
