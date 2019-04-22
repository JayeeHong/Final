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
	
	public int getChatContentNo() {
		return chatContentNo;
	}
	public void setChatContentNo(int chatContentNo) {
		this.chatContentNo = chatContentNo;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getChatContent() {
		return chatContent;
	}
	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}
	public Date getChatDate() {
		return chatDate;
	}
	public void setChatDate(Date chatDate) {
		this.chatDate = chatDate;
	}
	public int getChatRoomNo() {
		return chatRoomNo;
	}
	public void setChatRoomNo(int chatRoomNo) {
		this.chatRoomNo = chatRoomNo;
	}
	public String getChatReport() {
		return chatReport;
	}
	public void setChatReport(String chatReport) {
		this.chatReport = chatReport;
	}
	
	@Override
	public String toString() {
		return "SellerBuyerChat [chatContentNo=" + chatContentNo + ", sellerId=" + sellerId + ", buyerId=" + buyerId
				+ ", chatContent=" + chatContent + ", chatDate=" + chatDate + ", chatRoomNo=" + chatRoomNo
				+ ", chatReport=" + chatReport + "]";
	}
	
}
