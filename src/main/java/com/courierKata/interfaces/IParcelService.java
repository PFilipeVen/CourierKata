package com.courierKata.interfaces;

import com.courierKata.models.Parcel;

public interface IParcelService {
	
	  Parcel CreateParcel(Integer width, Integer height, Integer length, Integer weightKg);
}
