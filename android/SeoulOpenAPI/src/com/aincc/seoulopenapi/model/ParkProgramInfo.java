package com.aincc.seoulopenapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.aincc.seoulopenapi.openapi.park.OpenParkProgramInfo;

/**
 * 
 * <h3><b>ParkProgramInfo</b></h3></br>
 * 
 * 공원 프로그램 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenParkProgramInfo
 */
public class ParkProgramInfo extends BaseModel implements Parcelable
{
	/**
	 * 공원번호
	 */
	public String P_IDX;

	/**
	 * 프로그램번호
	 */
	public String G_IDX;

	/**
	 * 프로그램명
	 */
	public String P_NAME;

	/**
	 * 행사대상
	 */
	public String P_EDUPERSON;

	/**
	 * 인원
	 */
	public String P_EAMAX;

	/**
	 * 프로그램내용
	 */
	public String P_CONTENT;

	/**
	 * 프로그램시작일
	 */
	public String P_EDUDAY_S;

	/**
	 * 프로그램종료일
	 */
	public String P_EDUDAY_E;

	/**
	 * 프로그램시간
	 */
	public String P_EDUTIME;

	/**
	 * 요일
	 */
	public String P_PRODAY;

	/**
	 * 공원명
	 */
	public String P_PARK;

	/**
	 * 공원설명
	 */
	public String P_LIST_CONTENT;

	/**
	 * 주소
	 */
	public String P_ADDR;

	/**
	 * 지역
	 */
	public String P_ZONE;

	/**
	 * 관리부서
	 */
	public String P_DIVISION;

	/**
	 * 이미지
	 */
	public String P_IMG;

	/**
	 * 전화번호
	 */
	public String P_ADMINTEL;

	/**
	 * X좌표(WGS84)
	 */
	public String LONGITUDE;

	/**
	 * Y좌표(WGS84)
	 */
	public String LATITUDE;

	/**
	 * X좌표(GRS80TM)
	 */
	public String G_LONGITUDE;

	/**
	 * Y좌표(GRS80TM)
	 */
	public String G_LATITUDE;

	@Override
	public int describeContents()
	{
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeString(rowId);
		dest.writeString(P_IDX);
		dest.writeString(G_IDX);
		dest.writeString(P_NAME);
		dest.writeString(P_EDUPERSON);
		dest.writeString(P_EAMAX);
		dest.writeString(P_CONTENT);
		dest.writeString(P_EDUDAY_S);
		dest.writeString(P_EDUDAY_E);
		dest.writeString(P_EDUTIME);
		dest.writeString(P_PRODAY);
		dest.writeString(P_PARK);
		dest.writeString(P_LIST_CONTENT);
		dest.writeString(P_ADDR);
		dest.writeString(P_ZONE);
		dest.writeString(P_DIVISION);
		dest.writeString(P_IMG);
		dest.writeString(P_ADMINTEL);
		dest.writeString(LONGITUDE);
		dest.writeString(LATITUDE);
		dest.writeString(G_LONGITUDE);
		dest.writeString(G_LATITUDE);
	}

	public static final Parcelable.Creator<ParkProgramInfo> CREATOR = new Creator<ParkProgramInfo>()
	{
		public ParkProgramInfo createFromParcel(Parcel source)
		{
			ParkProgramInfo item = new ParkProgramInfo();
			item.rowId = source.readString();
			item.P_IDX = source.readString();
			item.G_IDX = source.readString();
			item.P_NAME = source.readString();
			item.P_EDUPERSON = source.readString();
			item.P_EAMAX = source.readString();
			item.P_CONTENT = source.readString();
			item.P_EDUDAY_S = source.readString();
			item.P_EDUDAY_E = source.readString();
			item.P_EDUTIME = source.readString();
			item.P_PRODAY = source.readString();
			item.P_PARK = source.readString();
			item.P_LIST_CONTENT = source.readString();
			item.P_ADDR = source.readString();
			item.P_ZONE = source.readString();
			item.P_DIVISION = source.readString();
			item.P_IMG = source.readString();
			item.P_ADMINTEL = source.readString();
			item.LONGITUDE = source.readString();
			item.LATITUDE = source.readString();
			item.G_LONGITUDE = source.readString();
			item.G_LATITUDE = source.readString();
			return item;
		}

		public ParkProgramInfo[] newArray(int size)
		{
			return new ParkProgramInfo[size];
		}
	};
}
