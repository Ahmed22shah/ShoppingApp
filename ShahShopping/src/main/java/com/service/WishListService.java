package com.service;

import java.util.List;

import com.model.HaariUser;
import com.model.Product;
import com.model.WishList;

public interface WishListService {
	public String addItem(long product_id,long user_id);
	public WishList updateItem(long product_id, int cid,int cflag,int di);

	public void deleteItem( int cid,int productid);
	
	List<WishList> getWishList(int cid,int cflag);
	
	public void updatecflag(int cid,int cflag,String orderId,int de);

	public List<WishList> getWishlistDetail(int cid,int cflag, String InvoiceId);
}
