public class Coustomar
{
	private int c_id;
	private String c_name;
	private String c_password;
	private String c_Email;
	public Coustomar(int id, String nam, String pass, String mail )
	{
		c_id=id;
		c_name=nam;
		c_password=pass;
		c_Email=mail;
	}
	public int getId()
	{
		return c_id;
	}
	public String getName()
	{
		return c_name;
	}
	public String  getPass()
	{
		return c_password;
	}
	public String getEmail()
	{
		return c_Email;
	}
}