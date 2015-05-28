import java.awt.*;
import java.awt.event.*;
import java.lang.String.*;
import javax.swing.*;
import java.lang.Math.*;
class calculator implements ActionListener
{	
	Frame f;
	TextField tf;
	Button b1[]=new Button[35];
	String ch[]={"MC","<--","7","4","1","MR","CE","8","5","2","MS","C","9","6","3","M+","+ -","/","*","-","M-","_/","%","1 / x","=","0",".","+","","",""};
	int k=0,u;
	String s1,s2,s3,s4;
	char ch1[]=new char[30];
	char ch2[]=new char[30];
	float f1,f2,result;
	calculator(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(20,50,193,50);
		f.add(tf);
		for(int i=20;i<150;i=i+40)	
		{
			for(int j=40;j<205;j=j+33)
			{
				if(k!=25&&k!=24)
				{
					b1[k]=new Button(ch[k]);
					b1[k].setBounds(i,j+70,35,28);
					b1[k].addActionListener(this);
					f.add(b1[k]);
				}
				k++;
			}
		}
		k=25;
		b1[k]=new Button(ch[k]);
		b1[k].addActionListener(this);
		b1[k].setBounds(20,280,75,28);
		f.add(b1[k]);
		k=24;
		b1[k]=new Button("=");
		b1[k].addActionListener(this);
		b1[k].setBounds(180,242,35,65);
		f.add(b1[k]);
		for(int i=20;i<150;i=i+40)
			{	if(k!=25&&k!=24)
				{
					b1[k]=new Button(ch[k]);
					b1[k].setBounds(i,280,35,28);
					b1[k].addActionListener(this);
					f.add(b1[k]);
				}
				k++;
			}
			k=20;
			for(int i=40;i<205;i=i+33)
				{	if(k!=25&&k!=24)
					{
						b1[k]=new Button(ch[k]);
						b1[k].setBounds(180,i+70,35,28);
						b1[k].addActionListener(this);
						f.add(b1[k]);
					}
					k++;
				}
				f.addWindowListener(new WindowEventListener());
				f.setLayout(null);
				f.setSize(230,320);
				f.setVisible(true);
				f.setBackground(Color.DARK_GRAY);
			}

			public void actionPerformed(ActionEvent e)
			{
				int n1=0,n2=0,n3=0; 
				s1=tf.getText();
				System.out.println(s1);
				if(e.getSource()==b1[0])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					tf.setText("MC");
				}
				if(e.getSource()==b1[1])
				{
					// tf.setText("<--");
					// s1=tf.getText();
					/*s1=s1.trim();
					System.out.println(s1.length());
					ch1=s1.toCharArray();
					
					for(int i=0;i<(s1.length());i++)
					{
						ch2[i]=ch1[i];
						if(i==s1.length()-1)
							ch2[i]=' ';
					}
					s1=String.valueOf(ch2);
					s1=s1.trim();
					System.out.println(s1);
					tf.setText(s1);*/
				}
				if(e.getSource()==b1[2])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("7");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
					{
						tf.setText( s1 +" 7");

					}
					else
						tf.setText(s1+"7");
				}
				if(e.getSource()==b1[3])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("4");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 4");
					else
						tf.setText(s1+"4");
				}
				if(e.getSource()==b1[4])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("1");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 1");
					else
						tf.setText(s1+"1");
				}
				if(e.getSource()==b1[5])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					tf.setText("MR");
				}
				if(e.getSource()==b1[6])
				{
					// tf.setText("CE");
					tf.setText("");
				}
				if(e.getSource()==b1[7])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("8");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 8");
					else
						tf.setText(s1+"8");
				}
				if(e.getSource()==b1[8])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("5");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 5");
					else
						tf.setText(s1+"5");
				}
				if(e.getSource()==b1[9])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("2");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 2");
					else
						tf.setText(s1+"2");
				}
				if(e.getSource()==b1[10])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					tf.setText("MS");
				}
				if(e.getSource()==b1[11])
				{
					// tf.setText("C");
					tf.setText("");
				}
				if(e.getSource()==b1[12])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("9");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 9");
					else
						tf.setText(s1+"9");
				}
				if(e.getSource()==b1[13])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("6");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 6");
					else
						tf.setText(s1+"6");
				}
				if(e.getSource()==b1[14])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("3");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 3");
					else
						tf.setText(s1+"3");
				}
				if(e.getSource()==b1[15])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					tf.setText("M+");
				}
				if(e.getSource()==b1[16])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					tf.setText("+-");
				}
				if(e.getSource()==b1[17])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(!s1.equals("") && !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
						tf.setText(s1 +"/");

				}
				if(e.getSource()==b1[18])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(!s1.equals("") && !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
						tf.setText(s1 +"*");
					
				}
				if(e.getSource()==b1[19])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(!s1.equals("") && !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
						tf.setText(s1 +"-");
					
				}
				if(e.getSource()==b1[20])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					tf.setText("M-");
				}
				if(e.getSource()==b1[21])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					// tf.setText("_/");
					s1.trim();
					if(!s1.equals("")&& !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
					{	
						double result1,d;
						if(s1.contains("."))
						{
							f1=Float.parseFloat(s1);
							d=(double)f1;
							result1=Math.sqrt(d);
								
						}
						else
						{
							n1=Integer.parseInt(s1);
							d=(double)n1;
							result1=Math.sqrt(d);
							
						}
						tf.setText("sqrt("+s1+") = "+result1);
					}
					f1=0;
					n1=0;

				}
				if(e.getSource()==b1[22])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}

					// tf.setText("%");
					s1.trim();
					if(!s1.equals("")&& !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
					{
						if(s1.contains("."))
						{
							f1=Float.parseFloat(s1);
							result=f1/100;
						}
						else
						{
							n1=Integer.parseInt(s1);
							result=((float)n1/100);
						}
						tf.setText(s1+" = "+result);
						
					}
					f1=0;
					n1=0;
					
				}
				if(e.getSource()==b1[23])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					// tf.setText("1 / X");
					s1.trim();
					if(!s1.equals("")&& !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
					{
						if(s1.contains("."))
						{
							f1=Float.parseFloat(s1);
							result=1/f1;
						}
						else
						{
							n1=Integer.parseInt(s1);
							result=(1/(float)n1);
						}
						tf.setText(s1+" = "+result);
						
					}
					f1=0;
					n1=0;
				}
				if(e.getSource()==b1[24])
				{	
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					// tf.setText("=");
					s1.trim();
					char ch[]=s1.toCharArray();
					if(s1.contains("+"))
					{
						n3=s1.indexOf("+");
					}
					else if(s1.contains("-"))
					{
						n3=s1.indexOf("-");
					}
					else if(s1.contains("*"))
					{
						n3=s1.indexOf("*");
					}
					else if(s1.contains("/"))
					{
						n3=s1.indexOf("/");
					}
					int n4=s1.length();
					result=0;
					int k=0;
					// System.out.println(n3+" "+n4);
					if(s1.contains("+")||s1.contains("-")||s1.contains("*")||s1.contains("/"))
					{
						for(int i=0;i<n4;i++)
						{
							if(i<n3)
							{		
								ch1[i]=ch[i];
								// System.out.println(ch1[i]);
							}	
							else if(i>n3)
							{
								ch2[k]=ch[i];
								k++;
							}
						}
						s3=String.valueOf(ch1);
						s4=String.valueOf(ch2);
						s3=s3.trim();
						s4=s4.trim();
						System.out.println(s3+" "+s4);
						if(!s1.contains("."))
						{
							n1=Integer.parseInt(s3);
							n2=Integer.parseInt(s4);
						}
						else
						{
							 f1=Float.parseFloat(s3);
							 f2=Float.parseFloat(s4);
							System.out.println(f1+" "+f2);
						}

						if(s1.contains("+"))
						{
							if(!s1.contains("."))
							result=n1+n2;
							else
							result=f1+f2;	
						}
						else if(s1.contains("-"))
						{
							if(!s1.contains("."))
							result=n1-n2;
							else
							result=f1-f2;
						}
						else if(s1.contains("*"))
						{
							if(!s1.contains("."))
							result=n1*n2;
							else
							result=f1*f2;
						}
						else if(s1.contains("/"))
						{
							if(!s1.contains("."))
							result=(float)n1/n2;
							else
							result=f1/f2;
						}
						tf.setText(s1+" = "+result);
					}
				}
				if(e.getSource()==b1[25])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}
					if(s1.equals(""))
						tf.setText("0");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" 0");
					else
						tf.setText(s1+"0");
				}
				if(e.getSource()==b1[26])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}

					if(s1.equals(""))
						tf.setText(".");
					else if(s1.equals("+")||s1.equals("-")||s1.equals("*")||s1.equals("/")||s1.equals("_/"))
						tf.setText( s1 +" .");
					else
						tf.setText(s1+".");
				}
				if(e.getSource()==b1[27])
				{
					if(s1.contains("="))
					{	
						s1="";
						tf.setText("");
					}

					if(!s1.equals("") && !s1.contains("+") && !s1.contains("-") && !s1.contains("*") && !s1.contains("/") && !s1.contains("_/"))
						tf.setText(s1 +"+");
				}
			}
			class WindowEventListener extends WindowAdapter
			{
				public void windowClosing(WindowEvent e1)
				{
					System.exit(0);
				}
			}
			public static void main(String[] args)
			{
				new calculator("Calculator");
			}
		}
