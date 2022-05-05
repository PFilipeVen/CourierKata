package com.courierKata.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.courierKata.Util.Constants;
import com.courierKata.enums.ParcelType;
import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;

@Service
public class DiscountService {

	public OutputCourier possibleDiscountFinder(OutputCourier outputCourier) {
		List<Parcel> parcelsOriginal = outputCourier.getParcels();
		ArrayList<Parcel> parcelsClone = new ArrayList(bucketFillParcelByTypeAndOrder(parcelsOriginal, null));

		List<Parcel> smallParcels = bucketFillParcelByTypeAndOrder(parcelsOriginal, ParcelType.Small);
		List<Parcel> mediumParcels = bucketFillParcelByTypeAndOrder(parcelsOriginal, ParcelType.Medium);

		outputCourier.setTotalCostBeforeDiscounts(outputCourier.getTotalCost());
		int smallDiscountOccurence = smallParcels.size() / 4;
		int mediumDiscountOccurence = mediumParcels.size() / 3;
		int totalDiscountedParcels = smallDiscountOccurence + mediumDiscountOccurence;

		while (smallDiscountOccurence > 0) {
			outputCourier.setTotalCost(outputCourier.getTotalCost() - smallParcels.get(0).getParcelTotalCost());
			if (smallDiscountOccurence > 1) {
				List<Parcel> toDelete = smallParcels.subList(5, 8);
				parcelsClone.removeAll(toDelete);
				smallParcels.removeAll(toDelete);
				parcelsClone.remove(smallParcels.get(0));
				smallParcels.remove(smallParcels.get(0));
			} else {
				List<Parcel> toDelete = smallParcels.subList(0, 4);
				parcelsClone.removeAll(toDelete);
				smallParcels.removeAll(toDelete);
			}
			smallDiscountOccurence -= 1;

		}

		while (mediumDiscountOccurence > 0) {
			outputCourier.setTotalCost(outputCourier.getTotalCost() - mediumParcels.get(0).getParcelTotalCost());
			if (mediumDiscountOccurence > 1) {
				List<Parcel> toDelete = mediumParcels.subList(4, 6);
				parcelsClone.removeAll(toDelete);
				mediumParcels.removeAll(toDelete);
				parcelsClone.remove(mediumParcels.get(0));
				mediumParcels.remove(mediumParcels.get(0));
			} else {
				List<Parcel> toDelete = mediumParcels.subList(0, 3);
				parcelsClone.removeAll(toDelete);
				smallParcels.removeAll(toDelete);
			}
			mediumDiscountOccurence -= 1;
		}
		int restDiscountOccurence = parcelsClone.size() / 5;
		totalDiscountedParcels += restDiscountOccurence;
		outputCourier.setDiscountOccurences(totalDiscountedParcels);

		while (restDiscountOccurence > 0) {
			outputCourier.setTotalCost(outputCourier.getTotalCost() - parcelsClone.get(0).getParcelTotalCost());
			if (restDiscountOccurence > 1) {
				List<Parcel> toDelete = parcelsClone.subList(6, 10);
				parcelsClone.removeAll(toDelete);
				parcelsClone.remove(parcelsClone.get(0));
			} else {
				List<Parcel> toDelete = parcelsClone.subList(0, 5);
				parcelsClone.removeAll(toDelete);
			}
			restDiscountOccurence -= 1;
		}
	
		
		return outputCourier;

	}

	public List<Parcel> bucketFillParcelByTypeAndOrder(List<Parcel> parcels, ParcelType parcelType) {
		List<Parcel> parcelToReturn = new ArrayList();
		for (Parcel parcel : parcels) {
			if ((parcelType == null) || parcel.getType() == parcelType) {
				parcelToReturn.add(parcel);
			}
		}
		Comparator<Parcel> compareByTotalCost = (Parcel o1, Parcel o2) -> o1.getParcelTotalCost()
				.compareTo(o2.getParcelTotalCost());
		Collections.sort(parcelToReturn, compareByTotalCost);

		return parcelToReturn;
	}
}
