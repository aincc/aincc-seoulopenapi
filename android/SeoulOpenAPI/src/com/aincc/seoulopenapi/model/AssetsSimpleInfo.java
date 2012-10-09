package com.aincc.seoulopenapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.aincc.seoulopenapi.openapi.culture.OpenAssetsSearchBy;

/**
 * 
 * <h3><b>AssetsSimpleInfo</b></h3></br>
 * 
 * 문화재 간략 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenAssetsSearchBy
 */
public class AssetsSimpleInfo extends BaseModel implements Parcelable
{
	/**
	 * 코드
	 */
	public String CODE;

	/**
	 * 문화재 분류코드
	 */
	public String CLSSCODE1;

	/**
	 * 문화재 세부분류코드
	 */
	public String CLSSCODE2;

	/**
	 * 문화재명(한글)
	 */
	public String CULTASSTK;

	/**
	 * 문화재명(한자)
	 */
	public String CULTASSTH;

	@Override
	public int describeContents()
	{
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeString(rowId);
		dest.writeString(CODE);
		dest.writeString(CLSSCODE1);
		dest.writeString(CLSSCODE2);
		dest.writeString(CULTASSTK);
		dest.writeString(CULTASSTH);
	}

	public static final Parcelable.Creator<AssetsSimpleInfo> CREATOR = new Creator<AssetsSimpleInfo>()
	{
		public AssetsSimpleInfo createFromParcel(Parcel source)
		{
			AssetsSimpleInfo item = new AssetsSimpleInfo();
			item.rowId = source.readString();
			item.CODE = source.readString();
			item.CLSSCODE1 = source.readString();
			item.CLSSCODE2 = source.readString();
			item.CULTASSTK = source.readString();
			item.CULTASSTH = source.readString();
			return item;
		}

		public AssetsSimpleInfo[] newArray(int size)
		{
			return new AssetsSimpleInfo[size];
		}
	};
}
