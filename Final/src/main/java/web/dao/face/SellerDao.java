package web.dao.face;

import web.dto.SellerInfo;

public interface SellerDao {

	// 로그인 정보 조회
	public int selectCntLogin(SellerInfo sellerInfo);

}
