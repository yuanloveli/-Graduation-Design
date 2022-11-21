package com.dq.springboot_recruit.entity;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月13日 下午10:07:20
*/
public class DeliveryInfo {
	int dno; 						//编号
	String ddate; 					//投递日期
	String nickname;				//求职者名称
	String companyname; 			//企业名
	String pname;				 	//职位名称
	int pno; 						//岗位编号
	int status; 					//状态 
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDdate() {
		return ddate;
	}
	public void setDdate(String ddate) {
		this.ddate = ddate;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyname == null) ? 0 : companyname.hashCode());
		result = prime * result + ((ddate == null) ? 0 : ddate.hashCode());
		result = prime * result + dno;
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + pno;
		result = prime * result + status;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryInfo other = (DeliveryInfo) obj;
		if (companyname == null) {
			if (other.companyname != null)
				return false;
		} else if (!companyname.equals(other.companyname))
			return false;
		if (ddate == null) {
			if (other.ddate != null)
				return false;
		} else if (!ddate.equals(other.ddate))
			return false;
		if (dno != other.dno)
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (pno != other.pno)
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DeliveryInfo [dno=" + dno + ", ddate=" + ddate + ", nickname=" + nickname + ", companyname="
				+ companyname + ", pname=" + pname + ", pno=" + pno + ", status=" + status + "]";
	}
	public DeliveryInfo(int dno, String ddate, String nickname, String companyname, String pname, int pno, int status) {
		super();
		this.dno = dno;
		this.ddate = ddate;
		this.nickname = nickname;
		this.companyname = companyname;
		this.pname = pname;
		this.pno = pno;
		this.status = status;
	}
	public DeliveryInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
