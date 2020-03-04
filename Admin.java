import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Admin extends Frame implements WindowListener, ActionListener  {
	private Register register;
	public TextField Food;
	public TextField Drinks;
	public TextField Price1;
	public TextField Price2;
	public TextField Price3;
	public TextField Remove;
	public Button Add1;
	public Button Add2;
	public Button remove;
	public Button Logout;

	

public Admin(Register r)
	{
		
		setLayout(null);
		setTitle("Admin");
		setSize(1090,720);
		
		
		this.register=r;
		
		Food= new TextField(10);
		Drinks=new TextField(10);
	    Remove=new TextField(10);
		Price1=new TextField(3);
		Price2=new TextField(3);
		Price3=new TextField(3);
		Add1=new Button("Add");
		Add2=new Button("ADD");
		remove=new Button("Remove");
		Logout=new Button("Logout");
		
		
		
		
		
		Food.setBounds(230,160,500,50);
		Drinks.setBounds(230,270,500,50);
		Remove.setBounds(230,380,500,50);
		Price1.setBounds(766,160,120,50);
		Price2.setBounds(766,270,120,50);
		Price3.setBounds(766,380,120,50);
		Add1.setBounds(930,160,70,50);
		Add2.setBounds(930,270,70,50);
		remove.setBounds(930,380,70,50);
		Logout.setBounds(430,450,250,70);
		
		
		add(Food);
		add(Drinks);
		add(Remove);
		add(Price1);
		add(Price2);
		add(Price3);
		add(Add1);
		add(Add2);
		add(remove);
		add(Logout);
	
		
		Logout.addActionListener(this);
		Add1.addActionListener(this);
		Add2.addActionListener(this);
		remove.addActionListener(this);
		addWindowListener(this);
		setLocation(150,150);
		
	
		
		
	}
	public void paint(Graphics g)
	{
		setBackground(new Color(28,98,99));
		g.drawString("Food",360,120);
		g.drawString("Drinks",360,250);
		g.drawString("Remove",360,360);
		g.drawString("Price",786,140);
		g.drawString("Price",786,250);
		g.drawString("Price",786,360);
	
		
	}
	public void windowClosing(WindowEvent we)
	{
        System.out.println("Window is closing");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e){
		DataAccess da=new DataAccess();
		String st=e.getActionCommand();
		int l=0;
		if(st.equals("Add")){
			String sql="INSERT INTO `product` (`pid`, `pprice`, `pname`) VALUES (NULL, '"+Price1.getText()+"','"+Food.getText()+"')";
			
			
			da.updateDB(sql);
			System.out.println(sql);
		}
		else if(st.equals("ADD"))
		{
			String sql="INSERT INTO `product` (`pid`, `pprice`, `pname`) VALUES (NULL, '"+Price2.getText()+"','"+Drinks.getText()+"')";
			
			da.updateDB(sql);
			System.out.println(sql);
	
		}
		else if(st.equals("Remove"))
		{
			String sql="delete from `product` where `pname`='"+Remove.getText()+"'";
			
			da.updateDB(sql);
			System.out.println(sql);
			
		}
		else if(st.equals("Logout")){
			register.admin.setVisible(false);
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
