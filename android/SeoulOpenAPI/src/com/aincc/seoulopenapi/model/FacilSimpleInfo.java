package com.aincc.seoulopenapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.aincc.seoulopenapi.openapi.culture.OpenFacilInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenFacilSearchBy;

/**
 * 
 * <h3><b>FacilSimpleInfo</b></h3></br>
 * 
 * 문화시설 간략 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenFacilInfo
 * @see OpenFacilSearchBy
 */
public class FacilSimpleInfo extends BaseModel implements Parcelable
{
	/**
	 * 문화시설코드
	 */
	public String FAC_CODE;

	/**
	 * 주제분류코드
	 */
	public String SUBJCODE;

	/**
	 * 테마분류코드
	 */
	public String THEMECODE;

	/**
	 * 문화시설명
	 */
	public String FAC_NAME;

	/**
	 * 주소
	 */
	public String ADDR;

	@Override
	public int describeContents()
	{
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeString(rowId);
		dest.writeString(FAC_CODE);
		dest.writeString(SUBJCODE);
		dest.writeString(THEMECODE);
		dest.writeString(FAC_NAME);
		dest.writeString(ADDR);
	}

	public static final Parcelable.Creator<FacilSimpleInfo> CREATOR = new Creator<FacilSimpleInfo>()
	{
		public FacilSimpleInfo createFromParcel(Parcel source)
		{
			FacilSimpleInfo item = new FacilSimpleInfo();
			item.rowId = source.readString();
			item.FAC_CODE = source.readString();
			item.SUBJCODE = source.readString();
			item.THEMECODE = source.readString();
			item.FAC_NAME = source.readString();
			item.ADDR = source.readString();
			return item;
		}

		public FacilSimpleInfo[] newArray(int size)
		{
			return new FacilSimpleInfo[size];
		}
	};
}
