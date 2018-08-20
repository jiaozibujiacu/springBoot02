package com.jiaozi.service;

import java.util.List;
import java.util.Map;

import com.jiaozi.domain.OpenLottery;

public interface OpenLotteryService {
	
	public void addOpenLottery(OpenLottery openLottery);
	
	public OpenLottery getOpenLotteryByT(Integer num01,Integer num02);
	
	public List<OpenLottery> getAllOpenLottery();
}
