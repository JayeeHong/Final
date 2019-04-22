package web.dto;

public class BookListInfo { // 판매부수정보
	
	private int magazineNo; // 판매부수번호
	private String month; // 보유 호수
	private int circulation; // 보유 부수
	
	public int getMagazineNo() {
		return magazineNo;
	}
	public void setMagazineNo(int magazineNo) {
		this.magazineNo = magazineNo;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getCirculation() {
		return circulation;
	}
	public void setCirculation(int circulation) {
		this.circulation = circulation;
	}
	
	@Override
	public String toString() {
		return "BookListInfo [magazineNo=" + magazineNo + ", month=" + month + ", circulation=" + circulation + "]";
	}
	
}
