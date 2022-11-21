package com.dq.springboot_recruit.entity;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月8日 上午11:11:03
*/
public class JoberInfo {
	int jno;			//求职者编号
	String nickname;	//昵称
	String pwd;			//密码
	String tel;			//手机号码
	String email;		//邮箱
	int status;			//账号状态
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getNickName() {
		return nickname;
	}
	public void setNickName(String nickName) {
		this.nickname = nickName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + jno;
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + status;
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
		JoberInfo other = (JoberInfo) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (jno != other.jno)
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (status != other.status)
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "joberInfo [jno=" + jno + ", nickName=" + nickname + ", pwd=" + pwd + ", tel=" + tel + ", email=" + email
				+ ", status=" + status + "]";
	}
	public JoberInfo(int jno, String nickName, String pwd, String tel, String email, int status) {
		super();
		this.jno = jno;
		this.nickname = nickName;
		this.pwd = pwd;
		this.tel = tel;
		this.email = email;
		this.status = status;
	}
	public JoberInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
