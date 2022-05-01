package com.courierKata.services;

import com.courierKata.Util.Constants;
import com.courierKata.enums.ParcelType;
import com.courierKata.interfaces.IParcelService;
import com.courierKata.models.Parcel;

public class ParcelService implements IParcelService {
	
	@Override
	public Parcel CreateParcel(Integer width, Integer height, Integer length, Integer weightKg) {
		Parcel currentParcel = new Parcel();
		if (width < 10 && height < 10 && length < 10) {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.Small);
			currentParcel.setBaseCost(Constants.SmallParcelBaseCost);
			currentParcel.setWeightKg(weightKg);
			currentParcel.setExtraWeightCost(extraWeightCostCalculator(Constants.SmallParcelWeightLimit, weightKg));
			currentParcel.setParcelTotalCost(currentParcel.getBaseCost() + currentParcel.getExtraWeightCost());
		
		} else if (width < 50 && height < 50 && length < 50) {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.Medium);
			currentParcel.setBaseCost(Constants.MediumParcelBaseCost);
			currentParcel.setWeightKg(weightKg);
			currentParcel.setExtraWeightCost(extraWeightCostCalculator(Constants.MediumParcelWeightLimit, weightKg));
			currentParcel.setParcelTotalCost(currentParcel.getBaseCost() + currentParcel.getExtraWeightCost());
			
		} else if (width < 100 && height < 100 && length < 100) {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.Large);
			currentParcel.setBaseCost(Constants.LargeParcelBaseCost);
			currentParcel.setWeightKg(weightKg);
			currentParcel.setExtraWeightCost(extraWeightCostCalculator(Constants.LargeParcelWeightLimit, weightKg));
			currentParcel.setParcelTotalCost(currentParcel.getBaseCost() + currentParcel.getExtraWeightCost());

		} else  {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.XL);
			currentParcel.setBaseCost(Constants.XLParcelBaseCost);
			currentParcel.setWeightKg(weightKg);
			currentParcel.setExtraWeightCost(extraWeightCostCalculator(Constants.XLParcelWeightLimit, weightKg));
			currentParcel.setParcelTotalCost(currentParcel.getBaseCost() + currentParcel.getExtraWeightCost());

		} 
		return currentParcel;
	}

	public static Double extraWeightCostCalculator(Integer limit, Integer actualWeight) {
		Double extraWeightCost = 0D;
		if (actualWeight > limit) {
			extraWeightCost = Constants.OverPricePerKg * (actualWeight - limit);
		}
		return extraWeightCost;
	}
}
