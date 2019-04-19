package web.service.face;

import web.dto.BuyerInfo;

public interface BuyerService {

	public boolean haveId(BuyerInfo bi);

	public void buyerJoin(BuyerInfo buyerInfo);

	public boolean buyerLogin(BuyerInfo buyerInfo);
	
}
