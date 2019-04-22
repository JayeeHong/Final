package web.dto;

import java.util.Date;

public class SellerBuyerChat { // 판매자-구매자 간 채팅

	private int chatContentNo; // 채팅내용번호
	private String sellerId; // 판매자 아이디(fk)
	private String buyerId; // 구매자 아이디(fk)
	private String chatContent; // 채팅내용
	private Date chatDate; // 채팅날짜
	private int chatRoomNo; // 채팅방 번호
	private String chatReport; // 신고여부
	
}
