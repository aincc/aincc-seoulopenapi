package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.culture.OpenAssetsMedia;

/**
 * 
 * <h3><b>AssetsMedia</b></h3></br>
 * 
 * 문화재 미디어 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenAssetsMedia
 */
public class AssetsMedia extends BaseModel
{
	/**
	 * 코드
	 */
	public String CODE;

	/**
	 * 데이터 일련번호
	 */
	public String FILE_IDX;

	/**
	 * 파일타입 (1: 이미지, 2: 동영상)
	 */
	public String FILETYPE;

	/**
	 * 파일명
	 */
	public String FILENAME;

	/**
	 * 파일경로
	 */
	public String FILEPATH;

	/**
	 * 파일설명
	 */
	public String FILEDESC;
}
