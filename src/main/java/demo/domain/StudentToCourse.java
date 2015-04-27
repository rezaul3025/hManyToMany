package demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentToCourse implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5283393313236619550L;
	@EmbeddedId
	StudentToCourseKey key;
	@Column(insertable=false, updatable=false)
	private Integer stdId;
	@Column(insertable=false, updatable=false)
	private Integer couId;
	@ManyToOne
	@JoinColumn(name="stdId", insertable=false, updatable=false)
	private Student student;
	@ManyToOne
	@JoinColumn(name="couId", insertable=false, updatable=false)
	private Course course;
	
	public StudentToCourseKey getKey()
	{
		return key;
	}
	public void setKey(StudentToCourseKey key)
	{
		this.key = key;
	}
	public Integer getStdId()
	{
		return stdId;
	}
	public void setStdId(Integer stdId)
	{
		this.stdId = stdId;
	}
	public Integer getCouId()
	{
		return couId;
	}
	public void setCouId(Integer couId)
	{
		this.couId = couId;
	}
	public Student getStudent()
	{
		return student;
	}
	public void setStudent(Student student)
	{
		this.student = student;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course = course;
	}
	
	
	
}
