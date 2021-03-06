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
		parcels.add(parcelService.CreateParcel(10, 3, 20,1));//8
		parcels.add(parcelService.CreateParcel(10, 3, 20,1));//8
		parcels.add(parcelService.CreateParcel(10, 3, 20,1));//8
		parcels.add(parcelService.CreateParcel(170, 5, 2,1));//25
		parcels.add(parcelService.CreateParcel(170, 5, 2,1));//25
		parcels.add(parcelService.CreateParcel(170, 5, 2,1));//25
		parcels.add(parcelService.CreateParcel(170, 5, 2,1));//25
		parcels.add(parcelService.CreateParcel(7, 2, 2,1));//3
		parcels.add(parcelService.CreateParcel(7, 2, 2,1));//3
		parcels.add(parcelService.CreateParcel(7, 2, 2,1));//3
		parcels.add(parcelService.CreateParcel(7, 2, 2,1));//3
		parcels.add(parcelService.CreateParcel(50, 67, 5,20));//29

		OutputCourierService outputCourierService = new OutputCourierService();
		OutputCourier outputCourier = outputCourierService.CreateOutputCourier(parcels,true);
		System.out.println(outputCourier.toString());
	}

}
