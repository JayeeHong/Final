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
	
	public int getLocNo() {
		return locNo;
	}
	public void setLocNo(int locNo) {
		this.locNo = locNo;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getSpot() {
		return spot;
	}
	public void setSpot(String spot) {
		this.spot = spot;
	}
	public String getSellerTimeS() {
		return sellerTimeS;
	}
	public void setSellerTimeS(String sellerTimeS) {
		this.sellerTimeS = sellerTimeS;
	}
	public String getSellerTimeE() {
		return sellerTimeE;
	}
	public void setSellerTimeE(String sellerTimeE) {
		this.sellerTimeE = sellerTimeE;
	}
	public String getSellerCard() {
		return sellerCard;
	}
	public void setSellerCard(String sellerCard) {
		this.sellerCard = sellerCard;
	}
	public int getMagazineNo() {
		return magazineNo;
	}
	public void setMagazineNo(int magazineNo) {
		this.magazineNo = magazineNo;
	}
	
	@Override
	public String toString() {
		return "SellerLoc [locNo=" + locNo + ", zone=" + zone + ", station=" + station + ", spot=" + spot
				+ ", sellerTimeS=" + sellerTimeS + ", sellerTimeE=" + sellerTimeE + ", sellerCard=" + sellerCard
				+ ", magazineNo=" + magazineNo + "]";
	}
	
}
