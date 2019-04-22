package web.dto;

import java.util.Date;

public class BuyerBooking { // 마이페이지 예약내역
	
	private String buyerId; // 구매자 아이디
	private String station; // 판매장소(역)
	private String bookTime; // 예약시간
	private String bookMonth; // 예약호수
	private int bookNumber; // 예약부수
	private String status; // 상태
	private int total; // 결제예정금액
	private Date bookDate; // 예약날짜

}
