public class Register{
	public Loginpage loginpage;
	public SignUpPage signUpPage;
	public AdminLogin adminLogin;
	public Admin admin;
	public Order order;
	public Buffer buffer;
	public Register(){
		loginpage=null;
		signUpPage=null;
		adminLogin=null;
		admin=null;
		order=null;
		buffer=new Buffer(50);
	}
}