package web.dto;

import java.util.Date;

public class Review { // 후기
	
	private int reviewNo; // 후기번호
	private String reviewTitle; // 제목
	private String reviewContent; // 내용
	private Date reviewDate; // 작성일
	private String sellerId; // 판매자 아이디(fk)

}
