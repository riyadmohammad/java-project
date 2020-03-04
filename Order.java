import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Order extends Frame implements WindowListener, ActionListener{

	
	
	
	private Register register;
	public TextField TXF1;
	public TextField TXF2;
	public TextField TXF3;
	public TextField TXF4;
	public TextField TXF5;
	public TextField TXF6;
	public TextField TXF7;
	public TextField TXF8;
	public TextField TXF9;
	public TextField TXF10;
	
	
	
	

	public Button b1;
	public Button b2;
	public Button b3;
	public Button b4;
	public Button b5;
	public Button b6;
	public Button b7;
	public Button b8;
	public Button b9;
	public Button b10;


	public Button reset;
	public Button Logout;
	public Button order;
	public TextArea bill;
	
	
	public Order(Register r)
	{
		setLayout(null);
		setTitle("Order");
		setSize(1090,720);
		this.register=r;
		
		TXF1=new TextField(3);
		TXF2=new TextField(3);
		TXF3=new TextField(3);
		TXF4=new TextField(3);
		TXF5=new TextField(3);
		TXF6=new TextField(3);
		TXF7=new TextField(3);
		TXF8=new TextField(3);
		TXF9=new TextField(3);
		TXF10=new TextField(3);
		
		b1=new Button("ADD1");
		b2=new Button("ADD2");
		b3=new Button("ADD3");
		b4=new Button("ADD4");
		b5=new Button("ADD5");
		b6=new Button("ADD6");
		b7=new Button("ADD7");
		b8=new Button("ADD8");
		b9=new Button("ADD9");
		b10=new Button("ADD10");
		
		bill=new TextArea();
		
		
		
		
		

		reset=new Button("Reset");
		order=new Button("Order");
		Logout=new Button("Logout");
		
	
		
		TXF1.setBounds(288,106,50,30);
		TXF2.setBounds(288,188,50,30);
		TXF3.setBounds(288,253,50,30);
		TXF4.setBounds(288,319,50,30);
		TXF5.setBounds(288,385,50,30);
		TXF6.setBounds(553,106,50,30);
		TXF7.setBounds(553,188,50,30);
		TXF8.setBounds(553,253,50,30);
		TXF9.setBounds(553,319,50,30);
		TXF10.setBounds(553,385,50,30);
		
		b1.setBounds(110,110,30,20);
		b2.setBounds(110,192,30,20);
		b3.setBounds(110,257,30,20);
		b4.setBounds(110,323,30,20);
		b5.setBounds(110,389,30,20);
		b6.setBounds(375,110,30,20);
		b7.setBounds(375,192,30,20);
		b8.setBounds(375,257,30,20);
		b9.setBounds(375,323,30,20);
		b10.setBounds(375,389,30,20);
		
		
		
	
		order.setBounds(247,477,300,70);
		reset.setBounds(878,477,100,40);
		Logout.setBounds(723,529,300,70);
		bill.setBounds(650,50,400,400);
		
		
		
		add(TXF1);
		add(TXF2);
		add(TXF3);
		add(TXF4);
		add(TXF5);
		add(TXF6);
		add(TXF7);
		add(TXF8);
		add(TXF9);
		add(TXF10);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
	
		add(reset);
		add(Logout);
		add(order);
		add(bill);
	
		
		
	

		
		
		Logout.addActionListener(this);
		order.addActionListener(this);
		reset.addActionListener(this);
		addWindowListener(this);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
		
		
		setLocation(150,150);
		
		
	}
	public void paint(Graphics g)
	{
		setBackground(new Color(28,98,99));
		g.drawString("Drinks",160,70);
		g.drawString("Food",433,70);
		g.drawString("CocaCola",172,120);
		g.drawString("Cold Coffee",172,202);
		g.drawString("Sprite",172,267);
		g.drawString("Coffee",172,333);
		g.drawString("Tea",172,399);
		
		g.drawString("Samosa",410,120);
		g.drawString("Singara",410,202);
		g.drawString("Biriyani",410,267);
		g.drawString("Khicori",410,333);
		g.drawString("Burgar",410,399);
	
		
	
		
	}
	public void windowClosing(WindowEvent we)
	{
        System.out.println("Window is closing");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e){
		String st=e.getActionCommand();
		int l=0;
		if(st.equals("ADD1")){
			
			bill.setText(bill.getText()+"CocaCola:           "+TXF1.getText()+"            price\n");
			
				try{
				register.buffer.loadA_dmin("SELECT * FROM `product` WHERE `pname` like 'CocaCola' ");
				
				
		}
		catch(Exception ex){ex.printStackTrace();}
		}
		else if(st.equals("ADD2")){
			
			bill.setText(bill.getText()+"Cold Coffee:        "+TXF2.getText()+"\n");
		}
		else if(st.equals("ADD3")){
			
			bill.setText(bill.getText()+"Sprite:             "+TXF3.getText()+"\n");
		}
		else if(st.equals("ADD4")){
			
			bill.setText(bill.getText()+"Coffee:             "+TXF4.getText()+"\n");
		}
		else if(st.equals("ADD5")){
			
			bill.setText(bill.getText()+"Tea                 "+TXF5.getText()+"\n");
		}
		else if(st.equals("ADD6")){
			
			bill.setText(bill.getText()+"Samosa:             "+TXF6.getText()+"\n");
		}
		else if(st.equals("ADD7")){
			
			bill.setText(bill.getText()+"Singara:            "+TXF7.getText()+"\n");
		}
		else if(st.equals("Add8")){
			
			bill.setText(bill.getText()+"Biriyani:           "+TXF8.getText()+"\n");
		}
		else if(st.equals("ADD9")){
			
			bill.setText(bill.getText()+"Khicori:            "+TXF9.getText()+"\n");
		}
		else if(st.equals("ADD10")){
			
		bill.setText(bill.getText()+"Burgar:             "+TXF10.getText()+"\n");
		}
		
		
		else if(st.equals("Order")){
			
			
		}
		
			
			
			
			
			
			
			
			
			
		else if(st.equals("Reset")){
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
			bill.setText("");
		
			
			
			
		}
		else if(st.equals("Logout")){
			register.order.setVisible(false);
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