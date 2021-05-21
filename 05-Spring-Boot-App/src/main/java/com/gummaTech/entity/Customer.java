package com.gummaTech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private Integer cid;
	private String cname;
	private String cadd;
	
	public Customer(Integer cid, String cname, String cadd) {
		this.cid = cid;
		this.cname = cname;
		this.cadd = cadd;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + "]";
	}
	
	

}
