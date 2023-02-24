package com.dq.springboot_recruit.entity;

import lombok.Data;

/**
 *
 * @author yuanli
 * @date 2023/2/23 11:45
 */
@Data
public class ResumeInfo {
	int rno;			//简历编号
	String nickname;	//求职者昵称
	String realName;	//真实姓名
	String tel; 		//手机号码
	String age; 		//年龄
	String email; 		//邮箱
	String school; 		//学校
	String education; 	//学历
	String major; 		//专业
	String rdescr; 		//自我介绍
	String project; 	//项目经历
	String internship; 	//实习经历
	String skill; 		//专业技能
	String intention; 	//意向岗位
	int status; 		//简历状态
//	public int getRno() {
//		return rno;
//	}
//	public void setRno(int rno) {
//		this.rno = rno;
//	}
//	public String getNickname() {
//		return nickname;
//	}
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}
//	public String getRealName() {
//		return realName;
//	}
//	public void setRealName(String realName) {
//		this.realName = realName;
//	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	public String getAge() {
//		return age;
//	}
//	public void setAge(String age) {
//		this.age = age;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
//	public String getEducation() {
//		return education;
//	}
//	public void setEducation(String education) {
//		this.education = education;
//	}
//	public String getMajor() {
//		return major;
//	}
//	public void setMajor(String major) {
//		this.major = major;
//	}
//	public String getRdescr() {
//		return rdescr;
//	}
//	public void setRdescr(String rdescr) {
//		this.rdescr = rdescr;
//	}
//	public String getProject() {
//		return project;
//	}
//	public void setProject(String project) {
//		this.project = project;
//	}
//	public String getInternship() {
//		return internship;
//	}
//	public void setInternship(String internship) {
//		this.internship = internship;
//	}
//	public String getSkill() {
//		return skill;
//	}
//	public void setSkill(String skill) {
//		this.skill = skill;
//	}
//	public String getIntention() {
//		return intention;
//	}
//	public void setIntention(String intention) {
//		this.intention = intention;
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
//		result = prime * result + ((age == null) ? 0 : age.hashCode());
//		result = prime * result + ((education == null) ? 0 : education.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((intention == null) ? 0 : intention.hashCode());
//		result = prime * result + ((internship == null) ? 0 : internship.hashCode());
//		result = prime * result + ((major == null) ? 0 : major.hashCode());
//		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
//		result = prime * result + ((project == null) ? 0 : project.hashCode());
//		result = prime * result + ((rdescr == null) ? 0 : rdescr.hashCode());
//		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
//		result = prime * result + rno;
//		result = prime * result + ((school == null) ? 0 : school.hashCode());
//		result = prime * result + ((skill == null) ? 0 : skill.hashCode());
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
//		ResumeInfo other = (ResumeInfo) obj;
//		if (age == null) {
//			if (other.age != null)
//				return false;
//		} else if (!age.equals(other.age))
//			return false;
//		if (education == null) {
//			if (other.education != null)
//				return false;
//		} else if (!education.equals(other.education))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (intention == null) {
//			if (other.intention != null)
//				return false;
//		} else if (!intention.equals(other.intention))
//			return false;
//		if (internship == null) {
//			if (other.internship != null)
//				return false;
//		} else if (!internship.equals(other.internship))
//			return false;
//		if (major == null) {
//			if (other.major != null)
//				return false;
//		} else if (!major.equals(other.major))
//			return false;
//		if (nickname == null) {
//			if (other.nickname != null)
//				return false;
//		} else if (!nickname.equals(other.nickname))
//			return false;
//		if (project == null) {
//			if (other.project != null)
//				return false;
//		} else if (!project.equals(other.project))
//			return false;
//		if (rdescr == null) {
//			if (other.rdescr != null)
//				return false;
//		} else if (!rdescr.equals(other.rdescr))
//			return false;
//		if (realName == null) {
//			if (other.realName != null)
//				return false;
//		} else if (!realName.equals(other.realName))
//			return false;
//		if (rno != other.rno)
//			return false;
//		if (school == null) {
//			if (other.school != null)
//				return false;
//		} else if (!school.equals(other.school))
//			return false;
//		if (skill == null) {
//			if (other.skill != null)
//				return false;
//		} else if (!skill.equals(other.skill))
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
//		return "ResumeInfo [rno=" + rno + ", nickname=" + nickname + ", realName=" + realName + ", tel=" + tel
//				+ ", age=" + age + ", email=" + email + ", school=" + school + ", education=" + education + ", major="
//				+ major + ", rdescr=" + rdescr + ", project=" + project + ", internship=" + internship + ", skill="
//				+ skill + ", intention=" + intention + ", status=" + status + "]";
//	}
//	public ResumeInfo(int rno, String nickname, String realName, String tel, String age, String email, String school,
//			String education, String major, String rdescr, String project, String internship, String skill,
//			String intention, int status) {
//		super();
//		this.rno = rno;
//		this.nickname = nickname;
//		this.realName = realName;
//		this.tel = tel;
//		this.age = age;
//		this.email = email;
//		this.school = school;
//		this.education = education;
//		this.major = major;
//		this.rdescr = rdescr;
//		this.project = project;
//		this.internship = internship;
//		this.skill = skill;
//		this.intention = intention;
//		this.status = status;
//	}
//	public ResumeInfo() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
}
