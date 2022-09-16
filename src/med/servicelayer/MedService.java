package med.servicelayer;

import med.newtownDAO.*;


import java.util.Date;

import com.toedter.calendar.JDateChooser;


public class MedService {

	NewtownDAO newDAO=new NewtownDAO();
	
	public int addDealerDetails(int dealer_id,String dealer_name, String addr,int mobile, String city, String email, int co_id)
	{
		int update=0;
		try
		{
			update =newDAO.dealerDetails(dealer_id,dealer_name,  addr, mobile,  city,  email, co_id);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
	}
	public int addBillDetails(int bill_id,int pro_id,String cus_name,int quantity,int price,int total,String date)
	{
		
		int update=0;
		try
		{
			update =newDAO.billDetails(bill_id,pro_id,cus_name,quantity,price,total,date);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	public int addCompanyDetails(int co_id,String co_name,int mobile,String addr)
	{
		
		int update=0;
		try
		{
			update =newDAO.companyDetails(co_id,co_name,mobile,addr);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	public int addProductDetails(int pro_id, String pro_name,String co_name,String batch_no,int rate,String pro_type,String date,String date1)
	{
		
		int update=0;
		try
		{
			update =newDAO.productDetails(pro_id,pro_name,co_name,batch_no,rate,pro_type,date,date1);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	/*public int addPurchaseDetails(int pur_id,int dealer_id,int pro_id,String pur_date,int quantity,int rate,int total)
	{
		PurchaseBean prb=new PurchaseBean();
		prb.setPur_id(pur_id);
		prb.setDealer_id(dealer_id);
		prb.setPro_id(pro_id);
		prb.setPur_date(pur_date);
		prb.setQuantity(quantity);
		prb.setRate(rate);
		prb.setTotal(total);
		int update=0;
		try
		{
			update =newDAO.purchaseDetails(prb);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}*/
	public int addStockDetails(int st_id,int pro_id,int quantity)
	{
		System.out.println("In addstockdetails: "+st_id);
		System.out.println(pro_id);
		System.out.println(quantity);
		int update=0;
		try
		{
			update =newDAO.stockDetails( st_id, pro_id,quantity);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	public void addOnlineOrderDetails()
	{
	
		
	}
	public int editProductDetails(int pro_id, String pro_name,String co_name,String batch_no,int rate,String pro_type,String date,String date1)
	{
		
		int update=0;
		try
		{
			update =newDAO.editProductDetails(pro_id,pro_name,co_name,batch_no,rate,pro_type,date,date1);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	public int editCompanyDetails(int co_id,String co_name,int mobile,String addr)
	{
		
		int update=0;
		try
		{
			update =newDAO.editCompanyDetails(co_id,co_name,mobile,addr);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	public int editDealerDetails(int dealer_id,String dealer_name, String addr,int mobile, String city, String email, int co_id)
	{
		int update=0;
		try
		{
			update =newDAO.editDealerDetails(dealer_id,dealer_name,  addr, mobile,  city,  email, co_id);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
	}
	public int editStockDetails(int st_id,int pro_id,int quantity)
	{
		System.out.println("In addstockdetails: "+st_id);
		//System.out.println(pro_id);
		System.out.println(quantity);
		int update=0;
		try
		{
			update =newDAO.editStockDetails( st_id,quantity);
			return update;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
	////////////////////////////////////////////////////////////////////////////
	
	
	public int checkUser(String id,String pwd)
	{
		if(id=="admin" && pwd=="123")
		{
			return 0;
		}
		else if(id=="empl" && pwd=="empl@123")
		{
			return 0;
		}
		else
		{return 1;}
	}

}
