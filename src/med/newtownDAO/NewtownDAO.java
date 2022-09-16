package med.newtownDAO;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;



public class NewtownDAO {

	Connection con=null;
	PreparedStatement ps=null;
	int updatecount=0;
	public int billDetails(int bill_id,int pro_id,String cus_name,int quantity,int price,int total,String date)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into billDetails values(?,?,?,?,?,?,?);";
		    ps=con.prepareStatement(in);
		  
		    ps.setInt(1, bill_id);
		    ps.setInt(2, pro_id);
		    ps.setString(3, cus_name);
		    ps.setInt(4, quantity);
		    ps.setInt(5, price);
		    ps.setInt(6, total);
		    ps.setString(7, date);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
		    
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
		
	}
	
	public int companyDetails(int co_id,String co_name,int mobile,String addr)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into companyDetails values(?,?,?,?);";
	        ps=con.prepareStatement(in);
		    
		    ps.setInt(1, co_id);
		    ps.setString(2, co_name);
		    ps.setString(3, addr);
		    ps.setInt(4, mobile);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	public int dealerDetails(int dealer_id,String dealer_name, String addr,int mobile, String city, String email, int co_id)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into dealerDetails values(?,?,?,?,?,?,?);";
		    ps=con.prepareStatement(in);
		    ps.setInt(1, dealer_id);
		    ps.setString(2, dealer_name);
		    ps.setString(3, addr);
		    ps.setInt(4, mobile);
		    ps.setString(5, city);
		    ps.setString(6, email);
		    ps.setInt(7, co_id);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	public int productDetails(int pro_id,String pro_name,String co_name,String batch_no,int rate,String pro_type,String date,String date1)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into productDetails values(?,?,?,?,?,?,?,?);";
		    ps=con.prepareStatement(in);
		    
		    ps.setInt(1, pro_id);
		    ps.setString(2, pro_name);
		    ps.setString(3, co_name);
		    ps.setString(4, batch_no);
		    ps.setInt(5, rate);
		    ps.setString(6, pro_type);
		    //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		    //String date=dateFormat.format(dateChooser.getdate());
		    ps.setString(7, date);
		    ps.setString(8, date1);
		    //ps.setDate(7,(java.sql.Date) mfg_date);
		    //ps.setDate(8,(java.sql.Date) exp_date);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
/*	public int purchaseDetails(PurchaseBean prb)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into purchaseDetails values(?,?,?,?,?,?,?);";
		    ps=con.prepareStatement(in);
		    prb=new PurchaseBean();
		    ps.setInt(1, prb.getPur_id());
		    ps.setInt(2, prb.getDealer_id());
		    ps.setInt(3, prb.getPro_id());
		    ps.setString(4, prb.getPur_date());
		    ps.setInt(5, prb.getQuantity());
		    ps.setInt(6, prb.getRate());
		    ps.setInt(7, prb.getTotal());
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}*/
	public int stockDetails(int st_id,int pro_id,int quantity)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into stockDetails values(?,?,?);";
		   
		    ps=con.prepareStatement(in);
		   /* sb=new StockBean();*/
		    ps.setInt(1, st_id);
		    ps.setInt(2, pro_id);
		    ps.setInt(3, quantity);
		    System.out.println("In newtowndao: "+st_id+" "+ pro_id+" "+quantity);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	public int orderDetails()
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="insert into billDetails values(?,?,?,?,?,?,?);";
		    ps=con.prepareStatement(in);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	
	public int editCompanyDetails(int co_id,String co_name,int mobile,String addr)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="update companydetails set co_name='?',addr='?',mobile=? where co_id=?;";
	        ps=con.prepareStatement(in);
		    
		    ps.setInt(4, co_id);
		    ps.setString(1, co_name);
		    ps.setString(2, addr);
		    ps.setInt(3, mobile);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	public int editDealerDetails(int dealer_id,String dealer_name, String addr,int mobile, String city, String email, int co_id)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="update dealerdetails set dealer_name='?',addr='?',mobile=?,city='?',email='?',co_id=? where dealer_id=?;";
		    ps=con.prepareStatement(in);
		    ps.setInt(7, dealer_id);
		    ps.setString(1, dealer_name);
		    ps.setString(2, addr);
		    ps.setInt(3, mobile);
		    ps.setString(4, city);
		    ps.setString(5, email);
		    ps.setInt(6,co_id);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	public int editProductDetails(int pro_id, String pro_name,String co_name,String batch_no,int rate,String pro_type,String date,String date1)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="update productdetails set pro_name='?',co_name='?',batch_no='?',rate=?,pro_type='?',date=?,date1=? where pro_id=?;";
		    ps=con.prepareStatement(in);
		  
		    ps.setInt(8, pro_id);
		    ps.setString(1, pro_name);
		    ps.setString(2, co_name);
		    ps.setString(3, batch_no);
		    ps.setInt(4, rate);
		    ps.setString(5, pro_type);
		    ps.setString(6, date);
		    ps.setString(7, date1);
		   // ps.setDate(6,  (java.sql.Date) mfg_date);
		    //ps.setDate(7,  (java.sql.Date) exp_date);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	public int editStockDetails(int st_id,int quantity)
	{
		try
	    {
			con=NewtownDB.getConnection();
		    String in="update stockdetails set quantity=? where st_id='?';";
		    ps=con.prepareStatement(in);
		    
		    ps.setInt(2, st_id);
		    //ps.setInt(2, pro_id);
		    ps.setInt(1, quantity);
		    updatecount=ps.executeUpdate();
		    con.close();
		    return updatecount;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return 0;
	    }
	}
	
}
