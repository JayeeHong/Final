package web.dto;

public class SellerInfo { // 판매자 계정
	
	private String sellerId; // 아이디
	private String sellerPw; // 비밀번호
	private String sellerPhone; // 전화번호
	private String sellerName; // 이름
	private int locNo; // 판매위치 번호 (fk)
	private String bigdomId; // 빅돔 아이디 (fk)
	private String sellerImg; // 판매자 사진

}
