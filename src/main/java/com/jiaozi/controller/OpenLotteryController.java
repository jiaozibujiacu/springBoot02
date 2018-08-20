package com.jiaozi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jiaozi.domain.OpenLottery;
import com.jiaozi.service.OpenLotteryService;

import ch.qos.logback.classic.Logger;

@RestController
public class OpenLotteryController {

	@Autowired
	private OpenLotteryService  openLotteryService;
	
	
	@RequestMapping("/kk")
	public String addOpenLottery() {

		for(int i = 1; i<11;i++) {			
			for(int c = i+1; c <= 11; c++) {
				OpenLottery openLottery = new OpenLottery();
				openLottery.setNumOpen1(i);
				openLottery.setNumOpen2(c);
				openLottery.setNumStr(i+","+c);
				openLotteryService.addOpenLottery(openLottery);
			}	
		}

		return "success";
		
	}
	
	@RequestMapping(value="/getOpenLottery/{num}/{num1}",method =RequestMethod.GET)
	public OpenLottery getOpenLotteryByT(@PathVariable(value ="num",required=false )Integer num01,
							@PathVariable(value = "num1",required = false)Integer num02) {
		
		return openLotteryService.getOpenLotteryByT(num01, num02);
		
	}
	
	@RequestMapping("/getAll")
	public List<OpenLottery> getAllOpenLottery(){
		return openLotteryService.getAllOpenLottery();
	}
}
