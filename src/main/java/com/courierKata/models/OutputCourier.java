package com.courierKata.models;

import java.util.List;

public class OutputCourier {
	
	private List<Parcel> parcels;
    private Double totalCost;
    private Boolean SpeedyShipping;
    private Double totalCostBeforeDiscounts; 
    private Integer DiscountOccurences;
    
    
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


	public Double getTotalCostBeforeDiscounts() {
		return totalCostBeforeDiscounts;
	}
	public void setTotalCostBeforeDiscounts(Double totalCostBeforeDiscounts) {
		this.totalCostBeforeDiscounts = totalCostBeforeDiscounts;
	}
	public Integer getDiscountOccurences() {
		return DiscountOccurences;
	}
	public void setDiscountOccurences(Integer discountOccurences) {
		DiscountOccurences = discountOccurences;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		int index = 0;
		str.append("********************PARSEL INFO********************\r\n");
		
		for (Parcel parcel : parcels) {
			index+=1;
			str.append("Parcel n: "+ index +"\t\t Parcel Type: " + parcel.getType() + "\t height: " + parcel.getHeightCm() + "\t length: " + parcel.getLengthCm() + "\t width: " + parcel.getWidthCm() + "\t weight: " + parcel.getWeightKg()  + "\r\n");
			str.append("Parcel cost: " + parcel.getBaseCost() + "\t extraweight cost: "+parcel.getExtraWeightCost() + "\t\t totalParcel cost:" + parcel.getParcelTotalCost() + "\r\n");
			if (SpeedyShipping) {	
				  str.append("SpeedyShipping: " + SpeedyShipping + "\t shipping cost added : "+ parcel.getParcelSpeedyShippingCost()+"\r\n");
			} 
			str.append("***************************************************\r\n");
		}
		
		if (DiscountOccurences > 0) {
			str.append("Discount Time!!, you pay " + DiscountOccurences + " less parcels!!Before discounts, the total order price was: "+ totalCostBeforeDiscounts +" \r\n");
		}
		str.append("Total Cost: " + totalCost);
		return str.toString();
	}
	
	
}
