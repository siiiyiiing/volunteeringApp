package com.sddevops.volunteeringapp_cw1_local;

public class Event {
	protected String date;
	protected String location;
	protected String eventDescription;
	protected String commitment;
	protected String endDate;
	
	public Event() {}
	
	public Event(String date, String location, String eventDescription, String commitment, String endDate) {
		super();
		this.date = date;
		this.location = location;
		this.eventDescription = eventDescription;
		this.commitment = commitment;
		this.endDate = endDate;
		}
	public String getDate() {
		return date;
		}
	
		public void setDate(String date) {
		this.date = date;
		}
		
		public String getLocation() {
		return location;
		}
		
		public void setLocation(String location) {
		this.location = location;
		}
		
		public String getEventDescription() {
		return eventDescription;
		}
		
		public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
		}
		
		public String getCommitment() {
		return commitment;
		}
			
		public void setCommitment(String commitment) {
		this.commitment = commitment;
		}
			
		public String getEndDate() {
		return endDate;
		}
			
		public void setEndDate(String endDate) {
		this.endDate = endDate;
		}
}