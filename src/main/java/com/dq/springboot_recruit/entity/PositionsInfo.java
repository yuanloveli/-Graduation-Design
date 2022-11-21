package com.dq.springboot_recruit.entity;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:26:58
*/
public class PositionsInfo {
	int pno; 			//职位编号
	int cno; 			//企业编号
	String pname; 		//职位名称
	String companyname;	//公司名称
	String companypic;	//职位公司logo
	int tno;			//所属类型
	String tname;		//类型名
	String price; 		//职位薪资
	String intro; 		//简介
	String place;		//工作地点
	String descr; 		//职位要求
	String pdate; 		//发布日期
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCompanypic() {
		return companypic;
	}
	public void setCompanypic(String companypic) {
		this.companypic = companypic;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cno;
		result = prime * result + ((companyname == null) ? 0 : companyname.hashCode());
		result = prime * result + ((companypic == null) ? 0 : companypic.hashCode());
		result = prime * result + ((descr == null) ? 0 : descr.hashCode());
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
		result = prime * result + ((pdate == null) ? 0 : pdate.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + pno;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		result = prime * result + tno;
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
		PositionsInfo other = (PositionsInfo) obj;
		if (cno != other.cno)
			return false;
		if (companyname == null) {
			if (other.companyname != null)
				return false;
		} else if (!companyname.equals(other.companyname))
			return false;
		if (companypic == null) {
			if (other.companypic != null)
				return false;
		} else if (!companypic.equals(other.companypic))
			return false;
		if (descr == null) {
			if (other.descr != null)
				return false;
		} else if (!descr.equals(other.descr))
			return false;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		if (pdate == null) {
			if (other.pdate != null)
				return false;
		} else if (!pdate.equals(other.pdate))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (pno != other.pno)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		if (tno != other.tno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PositionsInfo [pno=" + pno + ", cno=" + cno + ", pname=" + pname + ", companyname=" + companyname
				+ ", companypic=" + companypic + ", tno=" + tno + ", tname=" + tname + ", price=" + price + ", intro="
				+ intro + ", place=" + place + ", descr=" + descr + ", pdate=" + pdate + "]";
	}
	public PositionsInfo(int pno, int cno, String pname, String companyname, String companypic, int tno, String tname,
			String price, String intro, String place, String descr, String pdate) {
		super();
		this.pno = pno;
		this.cno = cno;
		this.pname = pname;
		this.companyname = companyname;
		this.companypic = companypic;
		this.tno = tno;
		this.tname = tname;
		this.price = price;
		this.intro = intro;
		this.place = place;
		this.descr = descr;
		this.pdate = pdate;
	}
	public PositionsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
