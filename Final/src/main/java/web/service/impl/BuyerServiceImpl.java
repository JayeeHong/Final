package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.BuyerDao;
import web.dto.BuyerInfo;
import web.service.face.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService{

	@Autowired BuyerDao buyerDao;
	
	@Override
	public boolean haveId(BuyerInfo bi) {
		int usingId = 0;
		
		usingId=buyerDao.usingid(bi);
		
		if(usingId==1) {
			return true;
		}
		return false;
	}

	@Override
	public void buyerJoin(BuyerInfo buyerInfo) {

		buyerDao.buyerJoin(buyerInfo);
		
	}

	@Override
	public boolean buyerLogin(BuyerInfo buyerInfo) {
		
		int login =  buyerDao.buyerLogin(buyerInfo);
		if(login == 1) {
			return true;
		}
		
		return false;
	}

}
