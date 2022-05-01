package com.courierKata.services;

import java.util.ArrayList;
import java.util.List;

import com.courierKata.interfaces.IOutputCourierService;
import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;

public class OutputCourierService implements IOutputCourierService {
	
	@Override
	public OutputCourier CreateOutputCourier(List<Parcel> parcels) {
		OutputCourier outputCourier = new OutputCourier();
		List<Parcel> parcelsToOutput = new ArrayList<>();
		Double totalCostToOutput = 0D;
		for (Parcel parcel : parcels) {
			parcelsToOutput.add(parcel);
			totalCostToOutput += parcel.getBaseCost();
		}
		outputCourier.setParcels(parcelsToOutput);
		outputCourier.setTotalCost(totalCostToOutput);
		return outputCourier;	
	}

}