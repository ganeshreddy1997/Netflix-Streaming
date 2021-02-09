package io.springboot2.x.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class NetflixTenure {
@Id	
private Integer id;
private String mobileNo;
private String mailId;
private String plan;
@JsonFormat(pattern="yyyy-MM-dd")
private Date start;
@JsonFormat(pattern="yyyy-MM-dd")
private Date stop;
private Integer durationInHrs;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPlan() {
	return plan;
}
public void setPlan(String plan) {
	this.plan = plan;
}
public Date getStart() {
	return start;
}
public void setStart(Date start) {
	this.start = start;
}
public Date getStop() {
	return stop;
}
public void setStop(Date stop) {
	this.stop = stop;
}
public Integer getDurationInHrs() {
	return durationInHrs;
}
public void setDurationInHrs(Integer durationInHrs) {
	this.durationInHrs = durationInHrs;
}


}
