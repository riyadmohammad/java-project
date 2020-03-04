public class Product
{
	private int p_id;
	private String p_price;
	private String p_name;
	
	public Product(int id, String price ,String name)
	{
		p_id=id;
		p_price=price;
		p_name=name;
		
	}
	public int getId(){return p_id;}
	public String getPprice(){return p_price;}
	public String getPName(){return p_name;}
}