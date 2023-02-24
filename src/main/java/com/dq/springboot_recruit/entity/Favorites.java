package com.dq.springboot_recruit.entity;

import lombok.Data;

/**
 *
 * @author yuanli
 * @date 2023/2/23 11:45
 */

@Data
public class Favorites {
	int fno;				//编号
	String nickname; 		//求职者昵称
	int pno; 				//职位编号
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + fno;
//		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
//		result = prime * result + pno;
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
//		Favorites other = (Favorites) obj;
//		if (fno != other.fno)
//			return false;
//		if (nickname == null) {
//			if (other.nickname != null)
//				return false;
//		} else if (!nickname.equals(other.nickname))
//			return false;
//		if (pno != other.pno)
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "Favorites [fno=" + fno + ", nickname=" + nickname + ", pno=" + pno + "]";
//	}
//	public Favorites(int fno, String nickname, int pno) {
//		super();
//		this.fno = fno;
//		this.nickname = nickname;
//		this.pno = pno;
//	}
//	public Favorites() {
//		super();
//	}
}
