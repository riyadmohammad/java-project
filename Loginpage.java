import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Loginpage extends Frame implements WindowListener, ActionListener{
	private Register register;
	public TextField cname;
	public TextField cpass;
	public Button loginButton;
	public Button CancleButton;
	public Button AdminButton;
	public Button signUpButton;
	
	public Loginpage(Register r){
		
		setSize(1090,720);
		setLocation(100,100);
		setLayout(null);
		setTitle("lOGINPAGE");
		this.register=r;
		cname=new TextField();
		cpass=new TextField();
		loginButton=new Button("Login");
		AdminButton=new Button("Admin");
		signUpButton=new Button("Signup");
		
		cname.setBounds(325,175,540,50);
		cpass.setBounds(325,296,540,50);
		loginButton.setBounds(500,360,170,50);
	    AdminButton.setBounds(790,640,200,50);
		signUpButton.setBounds(50,640,200,50);
		add(cname);
		add(cpass);
		add(loginButton);
		add(AdminButton);
		add(signUpButton);
		
		cpass.setEchoChar('*');
		
		loginButton.addActionListener(this);
		AdminButton.addActionListener(this);
		signUpButton.addActionListener(this);
		
		
		
		
		
		addWindowListener(this);
		
	}
	public void paint(Graphics g){
		setBackground(new Color(28,98,99));
		g.drawString("User Name:",325,150);
		g.drawString("Password:",325,270);
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		boolean b=false;
		if(s.equals("Login")){
			try{
				register.buffer.loadCoustomar("SELECT * FROM `customer`");
				
				b=register.buffer.checkCoustomarAuth(cname.getText(),cpass.getText());
				if(b){
					System.out.println("Valid User");
					register.order.setVisible(true);
					register.loginpage.setVisible(false);
				}
				else{
					System.out.println("Invalid User");
				}
			}
			catch(Exception ex){ex.printStackTrace();}
			
		}
		else if(s.equals("Signup")){
			register.loginpage.setVisible(false);
			register.signUpPage.setVisible(true);
		}
		else if(s.equals("Admin"))
		 {
		register.adminLogin.setVisible(true);
		register.loginpage.setVisible(false);
		    }
		}
		
		
	
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	


}