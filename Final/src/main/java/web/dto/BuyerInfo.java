package web.dto;

public class BuyerInfo {
	private String buyerId;
	private String buyerPw;
	private String buyerPhone;
	private String buyerEmail;
	private String buyerName;
	@Override
	public String toString() {
		return "BuyerInfo [buyerId=" + buyerId + ", buyerPw=" + buyerPw + ", buyerPhone=" + buyerPhone + ", buyerEmail="
				+ buyerEmail + ", buyerName=" + buyerName + "]";
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerPw() {
		return buyerPw;
	}
	public void setBuyerPw(String buyerPw) {
		this.buyerPw = buyerPw;
	}
	public String getBuyerPhone() {
		return buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	
	
}
