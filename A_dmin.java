public class A_dmin
{
	private int a_id;
	private String a_name;
	private String a_password;
	public A_dmin(int aid, String anam,String apss)
	{
		a_id=aid;
		a_name=anam;
		a_password=apss;
	}
	public int getAid(){return a_id;}
	public String getAName(){return a_name;}
	public String getApass(){return a_password;}
	
}