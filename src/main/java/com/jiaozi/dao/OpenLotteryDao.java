package com.jiaozi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.jiaozi.domain.OpenLottery;

public interface OpenLotteryDao {

	public void addOpenLottery(OpenLottery openLottery);
	
	public OpenLottery getOpenLotteryByT(@Param("numOpen1")Integer num01,@Param("numOpen2")Integer num02);
	
	public List<OpenLottery> getAllOpenLottery();
}
