package com.jiaozi.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiaozi.dao.OpenLotteryDao;
import com.jiaozi.domain.OpenLottery;
import com.jiaozi.service.OpenLotteryService;
@Service
public class OpenLotteryServiceImpl implements OpenLotteryService {
	
	@Autowired
	private OpenLotteryDao  openLotteryDao;
	public void addOpenLottery(OpenLottery openLottery) {
		
		openLotteryDao.addOpenLottery(openLottery);
	}
	
	
	public OpenLottery getOpenLotteryByT(Integer num01, Integer num02) {
		
		return openLotteryDao.getOpenLotteryByT(num01, num02);
	}
	
	
	public List<OpenLottery> getAllOpenLottery() {
		
		return openLotteryDao.getAllOpenLottery();
	}
	
	

}
