package com.courierKata.services;

import java.util.ArrayList;
import java.util.List;

import com.courierKata.Util.Constants;
import com.courierKata.interfaces.IOutputCourierService;
import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;

public class OutputCourierService implements IOutputCourierService {
	
	@Override
	public OutputCourier CreateOutputCourier(List<Parcel> parcels, Boolean speedyShipping) {
		OutputCourier outputCourier = new OutputCourier();
		List<Parcel> parcelsToOutput = new ArrayList<>();
		Double totalCostToOutput = 0D;
		for (Parcel parcel : parcels) {
			parcelsToOutput.add(parcel);
			totalCostToOutput += parcel.getParcelTotalCost();
		}
		outputCourier.setParcels(parcelsToOutput);
		
		totalCostToOutput = speedyShipping ? totalCostToOutput* Constants.ParcelSpeedyShippingChangerRate : totalCostToOutput;
		outputCourier.setTotalCost(totalCostToOutput);
		outputCourier.setSpeedyShipping(speedyShipping);
		
		return outputCourier;	
	}

}
