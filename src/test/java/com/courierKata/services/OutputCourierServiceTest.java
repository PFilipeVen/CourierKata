package com.courierKata.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;

class OutputCourierServiceTest {
	
	

	@Test
	void testCreateOutputCourier_AllCombined_TotalCost_with_SpeedyShipping() {
		List<Parcel> parcels = new ArrayList<Parcel>();
		ParcelService parcelService = new ParcelService();
		
		// Mock request
		parcels.add(parcelService.CreateParcel(1, 1, 1,3));
		parcels.add(parcelService.CreateParcel(25, 25, 2,10));
		parcels.add(parcelService.CreateParcel(88, 2, 2,30));
		parcels.add(parcelService.CreateParcel(110, 67, 5,40));
		parcels.add(parcelService.CreateParcel(1, 2, 3,100));
		OutputCourierService outputCourierService = new OutputCourierService();
		OutputCourier outputCourier = outputCourierService.CreateOutputCourier(parcels,true);
		
		assertEquals(428, outputCourier.getTotalCost());		
	}
	
	@Test
	void testCreateOutputCourier_AllCombined_TotalCost_without_SpeedyShipping() {
		List<Parcel> parcels = new ArrayList<Parcel>();
		ParcelService parcelService = new ParcelService();
		
		// Mock request
		parcels.add(parcelService.CreateParcel(1, 1, 1,3));
		parcels.add(parcelService.CreateParcel(25, 25, 2,10));
		parcels.add(parcelService.CreateParcel(88, 2, 2,30));
		parcels.add(parcelService.CreateParcel(110, 67, 5,100));
		OutputCourierService outputCourierService = new OutputCourierService();
		OutputCourier outputCourier = outputCourierService.CreateOutputCourier(parcels,false);
		
		assertEquals(159, outputCourier.getTotalCost());	
	}
	
	@Test
	void testCreateOutputCourier_AllSmall_TotalCost_with_SpeedyShipping() {
		List<Parcel> parcels = new ArrayList<Parcel>();
		ParcelService parcelService = new ParcelService();
		
		// Mock request
		parcels.add(parcelService.CreateParcel(1, 1, 1,3));
		parcels.add(parcelService.CreateParcel(8, 5, 2,4));
		parcels.add(parcelService.CreateParcel(7, 2, 2,1));
		parcels.add(parcelService.CreateParcel(2, 7, 5,3));
		OutputCourierService outputCourierService = new OutputCourierService();
		OutputCourier outputCourier = outputCourierService.CreateOutputCourier(parcels,true);
		
		assertEquals(38, outputCourier.getTotalCost());	
	}
	
	@Test
	void testCreateOutputCourier_AllSmall_TotalCost_without_SpeedyShipping() {
		List<Parcel> parcels = new ArrayList<Parcel>();
		ParcelService parcelService = new ParcelService();
		
		// Mock request
		parcels.add(parcelService.CreateParcel(1, 1, 1,3));
		parcels.add(parcelService.CreateParcel(8, 5, 2,4));
		parcels.add(parcelService.CreateParcel(7, 2, 2,1));
		parcels.add(parcelService.CreateParcel(2, 7, 5,3));
		OutputCourierService outputCourierService = new OutputCourierService();
		OutputCourier outputCourier = outputCourierService.CreateOutputCourier(parcels,false);
		
		assertEquals(19, outputCourier.getTotalCost());	
	}
	
}
