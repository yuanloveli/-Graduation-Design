package com.dq.springboot_recruit.entity;

import lombok.Data;

/**
 *
 * @author yuanli
 * @date 2023/2/23 11:41
 */

@Data
public class CompanyInfo {
	int cno;				//企业编号
	String nickname;		//账号昵称
	String companyname;		//企业名
	String companytype;		//企业类型
	String companydescr;	//企业描述
	String companypic;		//企业logo
	String pwd;				//企业密码
	String tel;				//手机号码
	String email;			//企业邮箱
	int status;				//账号状态
	
//	public String getNickname() {
//		return nickname;
//	}
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}
//	public int getCno() {
//		return cno;
//	}
//	public void setCno(int cno) {
//		this.cno = cno;
//	}
//	public String getCompanyname() {
//		return companyname;
//	}
//	public void setCompanyname(String companyname) {
//		this.companyname = companyname;
//	}
//	public String getCompanytype() {
//		return companytype;
//	}
//	public void setCompanytype(String companytype) {
//		this.companytype = companytype;
//	}
//	public String getCompanydescr() {
//		return companydescr;
//	}
//	public void setCompanydescr(String companydescr) {
//		this.companydescr = companydescr;
//	}
//	public String getCompanypic() {
//		return companypic;
//	}
//	public void setCompanypic(String companypic) {
//		this.companypic = companypic;
//	}
//	public String getPwd() {
//		return pwd;
//	}
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getStatus() {
//		return status;
//	}
//	public void setStatus(int status) {
//		this.status = status;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + cno;
//		result = prime * result + ((companydescr == null) ? 0 : companydescr.hashCode());
//		result = prime * result + ((companyname == null) ? 0 : companyname.hashCode());
//		result = prime * result + ((companypic == null) ? 0 : companypic.hashCode());
//		result = prime * result + ((companytype == null) ? 0 : companytype.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
//		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
//		result = prime * result + status;
//		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CompanyInfo other = (CompanyInfo) obj;
//		if (cno != other.cno)
//			return false;
//		if (companydescr == null) {
//			if (other.companydescr != null)
//				return false;
//		} else if (!companydescr.equals(other.companydescr))
//			return false;
//		if (companyname == null) {
//			if (other.companyname != null)
//				return false;
//		} else if (!companyname.equals(other.companyname))
//			return false;
//		if (companypic == null) {
//			if (other.companypic != null)
//				return false;
//		} else if (!companypic.equals(other.companypic))
//			return false;
//		if (companytype == null) {
//			if (other.companytype != null)
//				return false;
//		} else if (!companytype.equals(other.companytype))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (nickname == null) {
//			if (other.nickname != null)
//				return false;
//		} else if (!nickname.equals(other.nickname))
//			return false;
//		if (pwd == null) {
//			if (other.pwd != null)
//				return false;
//		} else if (!pwd.equals(other.pwd))
//			return false;
//		if (status != other.status)
//			return false;
//		if (tel == null) {
//			if (other.tel != null)
//				return false;
//		} else if (!tel.equals(other.tel))
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "CompanyInfo [cno=" + cno + ", nickname=" + nickname + ", companyname=" + companyname + ", companytype="
//				+ companytype + ", companydescr=" + companydescr + ", companypic=" + companypic + ", pwd=" + pwd
//				+ ", tel=" + tel + ", email=" + email + ", status=" + status + "]";
//	}
//	public CompanyInfo(int cno, String nickname, String companyname, String companytype, String companydescr,
//			String companypic, String pwd, String tel, String email, int status) {
//		super();
//		this.cno = cno;
//		this.nickname = nickname;
//		this.companyname = companyname;
//		this.companytype = companytype;
//		this.companydescr = companydescr;
//		this.companypic = companypic;
//		this.pwd = pwd;
//		this.tel = tel;
//		this.email = email;
//		this.status = status;
//	}
//	public CompanyInfo() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

}
