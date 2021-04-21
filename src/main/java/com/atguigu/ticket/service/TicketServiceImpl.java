package com.atguigu.ticket.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service//注意是dubbo的service,dubboo扫描到这个类就会把这个类当成服务发布出去
public class TicketServiceImpl implements TicketService{
	@Override
	public String getTicket() {
		return "《厉害了，我的国》";
	}
}
