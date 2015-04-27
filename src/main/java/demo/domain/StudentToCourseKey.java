package demo.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentToCourseKey implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1580785383071911318L;
	private Integer stdId;
	private Integer couId;
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
	
	
}
