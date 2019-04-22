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
	
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getBookTime() {
		return bookTime;
	}
	public void setBookTime(String bookTime) {
		this.bookTime = bookTime;
	}
	public String getBookMonth() {
		return bookMonth;
	}
	public void setBookMonth(String bookMonth) {
		this.bookMonth = bookMonth;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	
	@Override
	public String toString() {
		return "BuyerBooking [buyerId=" + buyerId + ", station=" + station + ", bookTime=" + bookTime + ", bookMonth="
				+ bookMonth + ", bookNumber=" + bookNumber + ", status=" + status + ", total=" + total + ", bookDate="
				+ bookDate + "]";
	}
	
}
