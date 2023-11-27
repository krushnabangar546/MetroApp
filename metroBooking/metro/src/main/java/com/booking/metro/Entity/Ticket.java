package com.booking.metro.Entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "tickets")
@Getter
@Setter
public class Ticket {
    @Id
    private String id;

    private String startStation;
    private String endStation;
    private LocalDateTime generatedTime;
    private int usageCount;
    
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStartStation(String startStation2) {
		// TODO Auto-generated method stub
		
	}

	public void setEndStation(String endStation2) {
		// TODO Auto-generated method stub
		
	}

	public void setGeneratedTime(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	public void setUsageCount(int i) {
		// TODO Auto-generated method stub
		
	}

	public Object getStartStation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEndStation() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getUsageCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public LocalDateTime getGeneratedTime() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
    
}
