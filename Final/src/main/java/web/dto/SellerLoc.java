package web.dto;

public class SellerLoc { // 판매자 판매정보
	
	private int locNo; // 판매위치 번호
	private String zone; // 지역(호선) - 서울:호선, 그외지역:지역이름
	private String station; // 판매장소(역) - 서울:역이름, 그외지역:판매장소이름
	private String spot; // 출구(위치) - 서울:출구번호, 그외지역:판매위치
	private String sellerTimeS; // 판매시작시간
	private String sellerTimeE; // 판매종료시간
	private String sellerCard; // 카드결제여부 - 가능, 불가능
	private int magazineNo; // 판매부수번호 (fk)

}
