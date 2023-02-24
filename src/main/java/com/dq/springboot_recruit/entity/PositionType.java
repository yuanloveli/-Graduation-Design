package com.dq.springboot_recruit.entity;

import lombok.Data;

/**
 *
 * @author yuanli
 * @date 2023/2/23 11:45
 */
@Data
public class PositionType {
	int tno;		//职位类型编号
	String tname;	//职位类型名
	String pic; 	//类型图片
	int status;		//职位类型状态
//	public int getTno() {
//		return tno;
//	}
//	public void setTno(int tno) {
//		this.tno = tno;
//	}
//	public String getTname() {
//		return tname;
//	}
//	public void setTname(String tname) {
//		this.tname = tname;
//	}
//	public String getPic() {
//		return pic;
//	}
//	public void setPic(String pic) {
//		this.pic = pic;
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
//		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
//		result = prime * result + status;
//		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
//		result = prime * result + tno;
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
//		PositionType other = (PositionType) obj;
//		if (pic == null) {
//			if (other.pic != null)
//				return false;
//		} else if (!pic.equals(other.pic))
//			return false;
//		if (status != other.status)
//			return false;
//		if (tname == null) {
//			if (other.tname != null)
//				return false;
//		} else if (!tname.equals(other.tname))
//			return false;
//		if (tno != other.tno)
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "positionType [tno=" + tno + ", tname=" + tname + ", pic=" + pic + ", status=" + status + "]";
//	}
//	public PositionType(int tno, String tname, String pic, int status) {
//		super();
//		this.tno = tno;
//		this.tname = tname;
//		this.pic = pic;
//		this.status = status;
//	}
//	public PositionType() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
}
