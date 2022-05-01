package com.courierKata.models;

import java.util.List;

public class OutputCourier {
	
	private List<Parcel> parcels;
    private Double totalCost ;
    
    
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
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Parcel parcel : parcels) {
			str.append("Parcel cost: " + parcel.getBaseCost() + ", Parcel Type: " + parcel.getType() +".\r\n");
		}
		str.append("Total Cost: " + totalCost);
		return str.toString();
	}
	
	
}
