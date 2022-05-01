package com.courierKata.models;

import java.util.List;

public class OutputCourier {
	
	private List<Parcel> parcels;
    private Double totalCost;
    private Boolean SpeedyShipping;
    
    
	public List<Parcel> getParcels() {
		return parcels;
	}
	public void setParcels(List<Parcel> parcels) {
		this.parcels = parcels;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	public Boolean getSpeedyShipping() {
		return SpeedyShipping;
	}
	public void setSpeedyShipping(Boolean speedyShipping) {
		SpeedyShipping = speedyShipping;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Parcel parcel : parcels) {
			if (SpeedyShipping) {
				str.append("Parcel cost: " + parcel.getBaseCost() + ", Parcel Type: " + parcel.getType() +".SpeedyShipping is ON! you pay more:"+ parcel.getBaseCost()+"\r\n");
			} else {
				str.append("Parcel cost: " + parcel.getBaseCost() + ", Parcel Type: " + parcel.getType() +".\r\n");
			}
		}
		str.append("Total Cost: " + totalCost);
		return str.toString();
	}
	
	
}
