package demo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4808667191691348804L;
	@Id
	private Integer couId;
	private String name;
	@OneToMany(mappedBy="course")
	private List<StudentToCourse> stdToCourse;
	
	public Integer getCouId()
	{
		return couId;
	}
	public void setCouId(Integer couId)
	{
		this.couId = couId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
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
