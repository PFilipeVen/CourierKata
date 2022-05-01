package com.courierKata.services;

import com.courierKata.enums.ParcelType;
import com.courierKata.interfaces.IParcelService;
import com.courierKata.models.Parcel;

public class ParcelService implements IParcelService {

	@Override
	public Parcel CreateParcel(Integer width, Integer height, Integer length) {
		Parcel currentParcel = new Parcel();
		if (width < 10 && height < 10 && length < 10) {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.Small);
			currentParcel.setBaseCost(3D);
		} else if (width < 50 && height < 50 && length < 50) {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.Medium);
			currentParcel.setBaseCost(8D);
		} else if (width < 100 && height < 100 && length < 100) {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.Large);
			currentParcel.setBaseCost(15D);
		} else  {
			currentParcel.setWidthCm(width);
			currentParcel.setHeightCm(height);
			currentParcel.setLengthCm(length);
			currentParcel.setType(ParcelType.XL);
			currentParcel.setBaseCost(25D);
		} 
		return currentParcel;
	}
}
