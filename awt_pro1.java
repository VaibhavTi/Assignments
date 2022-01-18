package AWT_PROGRAMS;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.plaf.LabelUI;
import javax.swing.text.LabelView;
public class awt_pro1 {

	awt_pro1()
	{
		Frame f=new JFrame();
		Label l=new Label("This is my new program using AWT lABEL :)");
		f.add(l);
		l.setBounds(20,60,290,20);
		Button b=new Button("Click here");
		b.setBounds(20,20,70,20);
		TextField t1=new TextField();
		t1.setBounds(20,90,120,20);
		f.add(b);
		f.add(t1);
		f.setLayout(null);
		
		f.setSize(300,400);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		awt_pro1 obj=new awt_pro1();
	}

}
