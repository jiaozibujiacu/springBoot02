package com.jiaozi.domain;

public class OpenLottery {
	
	private Integer id;
	
	private String numStr;
	
	private Integer numOpen1;
	
	private Integer numOpen2;
	
	private Integer openTime;

	public OpenLottery() {
		super();
	}
	
	public OpenLottery(String numStr, Integer numOpen1) {
		super();
		this.numStr = numStr;
		this.numOpen1 = numOpen1;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumStr() {
		return numStr;
	}

	public void setNumStr(String numStr) {
		this.numStr = numStr;
	}

	public Integer getNumOpen1() {
		return numOpen1;
	}

	public void setNumOpen1(Integer numOpen1) {
		this.numOpen1 = numOpen1;
	}

	public Integer getNumOpen2() {
		return numOpen2;
	}

	public void setNumOpen2(Integer numOpen2) {
		this.numOpen2 = numOpen2;
	}

	public Integer getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Integer openTime) {
		this.openTime = openTime;
	}
	
	
}
