package web.dto;

import java.util.Date;

public class BigdomBuyerChat { // 빅돔-구매자 간 채팅
	
	private int chatContentNo; // 채팅 내용 번호
	private String bigdomId; // 빅돔 아이디(fk)
	private String buyerId; // 구매자 아이디(fk)
	private String chatContent; // 채팅내용
	private Date chatDate; // 채팅날짜
	private int chatRoomNo; // 채팅방 번호
	private String chatReport; // 신고여부

}
