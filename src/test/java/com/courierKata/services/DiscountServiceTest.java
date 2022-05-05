package com.courierKata.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.courierKata.enums.ParcelType;
import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;


class DiscountServiceTest {

	@Test
	void testSmallParcelMania() {
		Parcel p1 = new Parcel();
		Parcel p2 = new Parcel();
		Parcel p3 = new Parcel();
		Parcel p4 = new Parcel();
	
		//parcels total cost is 100
		p1.setParcelTotalCost(10D);
		p2.setParcelTotalCost(20D);
		p3.setParcelTotalCost(30D);
		p4.setParcelTotalCost(40D);	
		p1.setType(ParcelType.Small);
		p2.setType(ParcelType.Small);
		p3.setType(ParcelType.Small);
		p4.setType(ParcelType.Small);
	
		List<Parcel> parceltest = new ArrayList();
		parceltest.add(p1);
		parceltest.add(p2);
		parceltest.add(p3);
		parceltest.add(p4);

		DiscountService discountService = new DiscountService();
		OutputCourier outputCourier = new OutputCourier();
		outputCourier.setParcels(parceltest);
		outputCourier.setTotalCost(100D);
		
	assertEquals(90,discountService.possibleDiscountFinder(outputCourier).getTotalCost());
	assertEquals(1,discountService.possibleDiscountFinder(outputCourier).getDiscountOccurences());
	}
	
	@Test
	void testMediumParcelMania() {
		Parcel p1 = new Parcel();
		Parcel p2 = new Parcel();
		Parcel p3 = new Parcel();
		Parcel p4 = new Parcel();
	
		//parcels total cost is 100
		p1.setParcelTotalCost(10D);
		p2.setParcelTotalCost(20D);
		p3.setParcelTotalCost(30D);
		p4.setParcelTotalCost(40D);	
		p1.setType(ParcelType.Medium);
		p2.setType(ParcelType.Medium);
		p3.setType(ParcelType.Medium);
		p4.setType(ParcelType.Medium);
	
		List<Parcel> parceltest = new ArrayList();
		parceltest.add(p1);
		parceltest.add(p2);
		parceltest.add(p3);
		parceltest.add(p4);

		DiscountService discountService = new DiscountService();
		OutputCourier outputCourier = new OutputCourier();
		outputCourier.setParcels(parceltest);
		outputCourier.setTotalCost(100D);
		
	assertEquals(90,discountService.possibleDiscountFinder(outputCourier).getTotalCost());
	assertEquals(1,discountService.possibleDiscountFinder(outputCourier).getDiscountOccurences());
	
	}
	
	@Test
	void testMixedParcelMania() {
		Parcel p1 = new Parcel();
		Parcel p2 = new Parcel();
		Parcel p3 = new Parcel();
		Parcel p4 = new Parcel();
		Parcel p5 = new Parcel();
		Parcel p6 = new Parcel();
		Parcel p7 = new Parcel();
		Parcel p8 = new Parcel();
		Parcel p9 = new Parcel();
		Parcel p10 = new Parcel();
		Parcel p11 = new Parcel();

		Double totalCostSum = 155D;
		Double expectedTotalAfterDiscount = 145D;
		int expectedDiscountOccurences = 2 ;
		p1.setParcelTotalCost(10D);
		p2.setParcelTotalCost(20D);
		p3.setParcelTotalCost(30D);
		p4.setParcelTotalCost(40D);
		p5.setParcelTotalCost(5D);	//will be discounted
		p6.setParcelTotalCost(10D);
		p7.setParcelTotalCost(5D);	//will be discounted
		p8.setParcelTotalCost(10D);
		p9.setParcelTotalCost(5D);
		p10.setParcelTotalCost(5D);
		p11.setParcelTotalCost(10D);
		p1.setType(ParcelType.Small);
		p2.setType(ParcelType.Small);
		p3.setType(ParcelType.Small);
		p4.setType(ParcelType.Small);
		p5.setType(ParcelType.Small);
		p6.setType(ParcelType.Medium);
		p7.setType(ParcelType.Medium);
		p8.setType(ParcelType.Medium);
		p9.setType(ParcelType.Large);
		p10.setType(ParcelType.Large);
		p11.setType(ParcelType.Large);

		List<Parcel> parceltest = new ArrayList();
		parceltest.add(p1);
		parceltest.add(p2);
		parceltest.add(p3);
		parceltest.add(p4);
		parceltest.add(p5);
		parceltest.add(p6);
		parceltest.add(p7);
		parceltest.add(p8);
		parceltest.add(p9);
		parceltest.add(p10);
		parceltest.add(p11);

		DiscountService discountService = new DiscountService();
		OutputCourier outputCourier = new OutputCourier();
		outputCourier.setParcels(parceltest);
		outputCourier.setTotalCost(totalCostSum);
		
	assertEquals(expectedTotalAfterDiscount,discountService.possibleDiscountFinder(outputCourier).getTotalCost());
	assertEquals(expectedDiscountOccurences,discountService.possibleDiscountFinder(outputCourier).getDiscountOccurences());
	
	}
	
	
}
