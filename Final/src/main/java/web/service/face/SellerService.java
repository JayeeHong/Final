package web.service.face;

import web.dto.SellerInfo;

public interface SellerService {

	// 판매자 로그인
	public boolean login(SellerInfo sellerInfo);

}
