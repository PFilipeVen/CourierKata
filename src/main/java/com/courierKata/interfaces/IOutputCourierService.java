package com.courierKata.interfaces;

import java.util.List;

import com.courierKata.models.OutputCourier;
import com.courierKata.models.Parcel;

public interface IOutputCourierService {
	OutputCourier CreateOutputCourier(List<Parcel> parcels);
}
