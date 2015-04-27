package demo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer stdId;
	private String name;
	private String dept;
	@JsonIgnore
	@OneToMany(mappedBy="student")
	private List<StudentToCourse> stdToCourse;
	
	public Student()
	{}
	
	public Student(Integer stdId, String name, String dept, List<StudentToCourse> stdToCourse)
	{
		super();
		this.stdId = stdId;
		this.name = name;
		this.dept = dept;
		this.stdToCourse = stdToCourse;
	}
	public Integer getStdId()
	{
		return stdId;
	}
	public void setStdId(Integer stdId)
	{
		this.stdId = stdId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		dept = dept;
	}
	public List<StudentToCourse> getStdToCourse()
	{
		return stdToCourse;
	}
	public void setStdToCourse(List<StudentToCourse> stdToCourse)
	{
		this.stdToCourse = stdToCourse;
	}
	
	
}
