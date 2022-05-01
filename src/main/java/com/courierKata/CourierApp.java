package com.courierKata;

import java.util.ArrayList;
import java.util.List;

import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;
import com.courierKata.services.OutputCourierService;
import com.courierKata.services.ParcelService;

public class CourierApp {
	
	public static void main(String[] args) {
		List<Parcel> parcels = new ArrayList<Parcel>();
		ParcelService parcelService = new ParcelService();
		
		// Mock request
		parcels.add(parcelService.CreateParcel(10, 3, 20,15));
		parcels.add(parcelService.CreateParcel(170, 5, 2,5));
		parcels.add(parcelService.CreateParcel(7, 2, 2,3));
		parcels.add(parcelService.CreateParcel(50, 67, 5,20));
		
		OutputCourierService outputCourierService = new OutputCourierService();
		OutputCourier outputCourier = outputCourierService.CreateOutputCourier(parcels,true);
		System.out.println(outputCourier.toString());
	}

}
