public class ProjectBase{
    public static void main(String str[]){
		Register r=new Register();
		r.loginpage=new Loginpage(r);
		r.adminLogin=new AdminLogin(r);
	    r.admin=new Admin(r);
		r.signUpPage=new SignUpPage(r);
		r.order=new Order(r);
        r.loginpage.setVisible(true);
		
		
		
    }
}