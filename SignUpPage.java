import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SignUpPage extends Frame implements WindowListener,ActionListener{
	private Register register;
	public TextField uName;
	public TextField Email;
	public TextField pl;
	public Button signUpButton;
	public Button backButton;
	public SignUpPage(Register r){
		setSize(1090,720);
		setLocation(100,100);
		setLayout(null);
		setTitle("SignUpPage");
		this.register=r;
		
		uName=new TextField(10);
		Email=new TextField(10);
		pl=new TextField(8);
		
		
		signUpButton=new Button("Signup");
		backButton=new Button("Back");
		
			
		
		uName.setBounds(160,170,540,70);
		Email.setBounds(160,325,540,70);
		pl.setBounds(160,475,540,70);
		signUpButton.setBounds(320,550,170,50);
		backButton.setBounds(900,50,170,50);
		
		pl.setEchoChar('*');
		
		



		
		add(uName);
		add(pl);
		add(Email);
		add(signUpButton);
		add(backButton);
		
		
		signUpButton.addActionListener(this);
		backButton.addActionListener(this);
		addWindowListener(this);
		setLocation(150,150);
		
	}
	public void paint(Graphics g)
	{
		setBackground(new Color(28,98,99));
		
		g.drawString("User Name :",368,150);
		g.drawString("Email:",375,300);
		g.drawString("Password",368,460);
	
		
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		DataAccess da=new DataAccess();
		String st=e.getActionCommand();
		if(st.equals("Signup")){
			String sql="INSERT INTO customer (cid,cname,cemail,cpass) values(null,'"+uName.getText()+"','"+Email.getText()+"','"+pl.getText()+"')";
			da.updateDB(sql);
			System.out.println(sql);
		}
		else if(st.equals("Back")){
			register.signUpPage.setVisible(false);
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

