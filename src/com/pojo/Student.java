package com.pojo;

public class Student {
	private int sid;
	private String sname;
	private int Mobno;
	private String address;
	private char presentstatus;
	private String std;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMobno() {
		return Mobno;
	}

	public void setMobno(int mobno) {
		Mobno = mobno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getPresentstatus() {
		return presentstatus;
	}

	public void setPresentstatus(char presentstatus) {
		this.presentstatus = presentstatus;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", Mobno=" + Mobno + ", address=" + address
				+ ", presentstatus=" + presentstatus + ", std=" + std + "]";
	}

}
