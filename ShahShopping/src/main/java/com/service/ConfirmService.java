package com.service;



import java.util.List;

import com.model.ConfirmOrder;
import com.model.WishList;


public interface ConfirmService {
	ConfirmOrder addOrder(int qty,double amount,int cid ,List<WishList> list, UserServiceImpl userservice,String payment_id,int invoiceNo);
	List<ConfirmOrder> getAllOrder(int ccflag);
	
	void updafeccflag(int cid,int ccflag,String invoiceId);

}
