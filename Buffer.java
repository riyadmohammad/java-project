import java.sql.ResultSet;
import java.sql.SQLException;
public class Buffer{
	public Coustomar cousmarList[];
	public A_dmin a_dminList[];
	public O_rdar o_rdarList[];
	public Product productlist[];
	public Type typeList[];
	
	
	
	public Buffer(int size){
		
	cousmarList=new Coustomar[size];
	a_dminList=new A_dmin[size];
	o_rdarList=new O_rdar[size];
	productlist=new Product[size];
	typeList=new Type[size];
	
	
	}
	public void loadCoustomar(String sql)throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData(sql);
		Coustomar c=null;
		int c_id;
		String c_name;
		String c_password;
		String c_Email;
		
		while(rs.next()){
			
			c_id=rs.getInt("cid");
			c_name=rs.getString("cname");
			c_password=rs.getString("cpass");
			c_Email=rs.getString("cemail");
			
			
			
			
			c=new Coustomar(c_id,c_name,c_password,c_Email);
			addCoustomar(c);
		}
	}
	public boolean checkCoustomarAuth(String c_name,String c_password){
		boolean flag=false;
		for(Coustomar c:cousmarList){
			if(c!=null){
				if(c.getName().equals(c_name) && c.getPass().equals(c_password)){
					flag=true;
				}
			}
		}
		return flag;
	}
	public void addCoustomar(Coustomar c){
		for(int i=0;i<cousmarList.length;i++){
			if(cousmarList[i]==null){
				cousmarList[i]=c;
				break;
			}
		}
	}
	
	
	
	
	public void loadA_dmin(String sql)throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData(sql);
		A_dmin ad=null;
		int a_id;
		String a_name;
		String a_password;
		
		while(rs.next()){
			
			a_id=rs.getInt("aid");
			a_name=rs.getString("aname");
			a_password=rs.getString("apass");
			
			
			
			
			
			ad=new A_dmin(a_id,a_name,a_password);
			addA_dmin(ad);
		}
	}
	public boolean checkA_dminAuth(String a_name,String a_password){
		boolean flag=false;
		for(A_dmin ad:a_dminList){
			if(ad!=null){
				if(ad.getAName().equals(a_name) && ad.getApass().equals(a_password)){
					flag=true;
				}
			}
		}
		return flag;
	}
	public void addA_dmin(A_dmin ad){
		for(int i=0;i<a_dminList.length;i++){
			if(a_dminList[i]==null){
				a_dminList[i]=ad;
				break;
			}
		}
	}
	
	
	
	
	public void loadO_rder(String sql)throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData(sql);
		O_rdar od=null;
		
		int o_id;
		
		
		while(rs.next()){
			
			o_id=rs.getInt("oid");
			
			
			
			
			od=new O_rdar(o_id);
			addO_rdar(od);
		}
	}
	/*public boolean checkO_rdarAuth(int o_id){
		boolean flag=false;
		for(O_rdar od:o_rdarList){
			if(od!=null){
				if(od.getOid().equals(o_id)){
					flag=true;
				}
			}
		}
		return flag;
	}*/
	public void addO_rdar(O_rdar od){
		for(int i=0;i<o_rdarList.length;i++){
			if(o_rdarList[i]==null){
				o_rdarList[i]=od;
				break;
			}
		}
	}
	
	
	
	
	
	
	
	public void loadProduct(String sql)throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData(sql);
		Product p=null;
		int p_id;
		String p_price;
		String p_name;
		
		while(rs.next()){
			
			p_id=rs.getInt("pid");
			p_price=rs.getString("pprice");
			p_name=rs.getString("pname");
		
			
			
			
			
			p=new Product(p_id,p_price,p_name);
			addProduct(p);
		}
	}
	/*public boolean checkProductAuth(String p_name,int p_price){
		boolean flag=false;
		for(Product p:productlist){
			if(p!=null){
				if(p.getPName().equals(p_name) && p.getPprice().equals(p_price)){
					flag=true;
				}
			}
		}
		return flag;
	}*/
	public void addProduct(Product p){
		for(int i=0;i<productlist.length;i++){
			if(productlist[i]==null){
				productlist[i]=p;
				break;
			}
		}
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
	
	
