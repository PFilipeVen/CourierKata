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
	parcel = parcelService.CreateParcel(2, 2, 2);
	assertEquals(ParcelType.Small,parcel.getType(),"Parcel type test failled");
	assertEquals(3D, parcel.getBaseCost(),"BaseCost test failled");
	}
	
	@Test
	void testCreateParcel_ForMedium() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(10, 2, 2);
	assertEquals(ParcelType.Medium,parcel.getType(),"Parcel type test failled");
	assertEquals(8D, parcel.getBaseCost(),"BaseCost test failled");
	}
	@Test
	void testCreateParcel_ForLarge() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(50, 2, 2);
	assertEquals(ParcelType.Large,parcel.getType(),"Parcel type test failled");
	assertEquals(15D, parcel.getBaseCost(),"BaseCost test failled");
	}
	@Test
	void testCreateParcel_ForXL() {
	ParcelService parcelService = new ParcelService();
	Parcel parcel = new Parcel();
	parcel = parcelService.CreateParcel(100, 2, 2);
	assertEquals(ParcelType.XL,parcel.getType(),"Parcel type test failled");
	assertEquals(25D, parcel.getBaseCost(),"BaseCost test failled");
	}

}
