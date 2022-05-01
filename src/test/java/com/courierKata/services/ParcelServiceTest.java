package com.courierKata.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.courierKata.enums.ParcelType;
import com.courierKata.models.Parcel;

class ParcelServiceTest {

	@Test
	void testCreateParcel_ForSmall() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(2, 2, 2,3);
	assertEquals(ParcelType.Small,parcel.getType(),"Parcel type test failled");
	assertEquals(3D, parcel.getBaseCost(),"BaseCost test failled");
	}
	
	@Test
	void testCreateParcel_ForMedium() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(10, 2, 2,4);
	assertEquals(ParcelType.Medium,parcel.getType(),"Parcel type test failled");
	assertEquals(8D, parcel.getBaseCost(),"BaseCost test failled");
	}
	@Test
	void testCreateParcel_ForLarge() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(50, 2, 2,5);
	assertEquals(ParcelType.Large,parcel.getType(),"Parcel type test failled");
	assertEquals(15D, parcel.getBaseCost(),"BaseCost test failled");
	}
	@Test
	void testCreateParcel_ForXL() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(100, 2, 2,49);
	assertEquals(ParcelType.XL,parcel.getType(),"Parcel type test failled");
	assertEquals(25D, parcel.getBaseCost(),"BaseCost test failled");
	}
	
	@Test
	void testCreateParcel_ForHeavy() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(100, 2, 2,59);
	assertEquals(ParcelType.HeavyParcel,parcel.getType(),"Parcel type test failled");
	assertEquals(50D, parcel.getBaseCost(),"BaseCost test failled");
	}
	
	@Test
	void testExtraWeightCostCalculator() {
		assertEquals(5,ParcelService.extraWeightCostCalculator(10, 15));
	}
	
	@Test
	void testParcelSpeedyShippingCostCalculator() {
		assertEquals(10,ParcelService.parcelSpeedyShippingCostCalculator(5D));
	}
	
	
}
