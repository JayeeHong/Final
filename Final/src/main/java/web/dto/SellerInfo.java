package web.dto;

public class SellerInfo { // 판매자 계정
	
	private String sellerId; // 아이디
	private String sellerPw; // 비밀번호
	private String sellerPhone; // 전화번호
	private String sellerName; // 이름
	private int locNo; // 판매위치 번호 (fk)
	private String bigdomId; // 빅돔 아이디 (fk)
	private String sellerImg; // 판매자 사진
	private String sort; // 유저분류
	
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerPw() {
		return sellerPw;
	}
	public void setSellerPw(String sellerPw) {
		this.sellerPw = sellerPw;
	}
	public String getSellerPhone() {
		return sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public int getLocNo() {
		return locNo;
	}
	public void setLocNo(int locNo) {
		this.locNo = locNo;
	}
	public String getBigdomId() {
		return bigdomId;
	}
	public void setBigdomId(String bigdomId) {
		this.bigdomId = bigdomId;
	}
	public String getSellerImg() {
		return sellerImg;
	}
	public void setSellerImg(String sellerImg) {
		this.sellerImg = sellerImg;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	@Override
	public String toString() {
		return "SellerInfo [sellerId=" + sellerId + ", sellerPw=" + sellerPw + ", sellerPhone=" + sellerPhone
				+ ", sellerName=" + sellerName + ", locNo=" + locNo + ", bigdomId=" + bigdomId + ", sellerImg="
				+ sellerImg + ", sort=" + sort + "]";
	}
	
}
