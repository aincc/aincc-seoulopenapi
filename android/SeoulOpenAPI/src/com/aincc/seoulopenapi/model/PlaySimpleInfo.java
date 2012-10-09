package com.aincc.seoulopenapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.aincc.seoulopenapi.openapi.culture.OpenPlayInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenPlaySearchBy;

/**
 * 
 * <h3><b>PlaySimpleInfo</b></h3></br>
 * 
 * 공연행사 정보(간략정보)
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenPlayInfo
 * @see OpenPlaySearchBy
 */
public class PlaySimpleInfo extends BaseModel implements Parcelable
{
	/**
	 * 문화정보코드
	 */
	public String CULTCODE;

	/**
	 * 주제분류코드
	 */
	public String SUBJCODE;

	/**
	 * 테마분류코드
	 */
	public String THEMECODE;

	/**
	 * 제목
	 */
	public String TITLE;

	/**
	 * 시작일자
	 */
	public String STRTDATE;

	/**
	 * 종료일자
	 */
	public String END_DATE;

	/**
	 * 장소
	 */
	public String PLACE;

	@Override
	public int describeContents()
	{
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeString(rowId);
		dest.writeString(CULTCODE);
		dest.writeString(SUBJCODE);
		dest.writeString(THEMECODE);
		dest.writeString(TITLE);
		dest.writeString(STRTDATE);
		dest.writeString(END_DATE);
		dest.writeString(PLACE);
	}

	public static final Parcelable.Creator<PlaySimpleInfo> CREATOR = new Creator<PlaySimpleInfo>()
	{
		public PlaySimpleInfo createFromParcel(Parcel source)
		{
			PlaySimpleInfo item = new PlaySimpleInfo();
			item.rowId = source.readString();
			item.CULTCODE = source.readString();
			item.SUBJCODE = source.readString();
			item.THEMECODE = source.readString();
			item.TITLE = source.readString();
			item.STRTDATE = source.readString();
			item.END_DATE = source.readString();
			item.PLACE = source.readString();
			return item;
		}

		public PlaySimpleInfo[] newArray(int size)
		{
			return new PlaySimpleInfo[size];
		}
	};
}
