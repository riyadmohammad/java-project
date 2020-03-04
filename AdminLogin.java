import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class AdminLogin extends Frame implements WindowListener, ActionListener{
	private Register register;
	public TextField aname;
	public TextField apass;
	public Button loginButton;
	public Button backButton;



	public AdminLogin(Register r){
		
		setSize(1090,720);
		
		setLocation(100,100);
		setLayout(null);
		setTitle("ADMINLOGINPAGE");
		
		this.register=r;
		aname=new TextField();
		apass=new TextField();
		loginButton=new Button("Login");
		backButton=new Button("Back");


		
		aname.setBounds(325,175,540,50);
		apass.setBounds(325,296,540,50);
		loginButton.setBounds(325,360,170,50);
		backButton.setBounds(900,650,170,50);


	
		add(aname);
		add(apass);
		add(loginButton);
		add(backButton);
		
		apass.setEchoChar('*');
		



		loginButton.addActionListener(this);
		backButton.addActionListener(this);
		addWindowListener(this);
		setLocation(150,150);
	}
	public void paint(Graphics g){
		setBackground(new Color(28,98,99));
		g.drawString("Admin User Name:",325,150);
		g.drawString("Password:",325,270);
		
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	
		public void actionPerformed(ActionEvent e){
		String st=e.getActionCommand();
		boolean b=false;
		int l=0;
	
		
		 if(st.equals("Login")){
			
			try{
				register.buffer.loadA_dmin("select * from `admin` ");
				
				b=register.buffer.checkA_dminAuth(aname.getText(),apass.getText());
				if(b){
					System.out.println("Valid User");
					register.admin.setVisible(true);
					register. adminLogin.setVisible(false);
				}
				else{
					System.out.println("Invalid User");
				}
			}
			catch(Exception ex){ex.printStackTrace();}
		}
		else if(st.equals("Back")){
			register.adminLogin.setVisible(false);
			register.loginpage.setVisible(true);
			}
	
	
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}


}
