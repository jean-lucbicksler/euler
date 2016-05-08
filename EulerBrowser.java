package net.pyretaursoft.euler;

import java.awt.ScrollPane;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EulerBrowser extends JFrame implements ActionListener {
	public static void main(String[] args) {
		EulerBrowser eb = new EulerBrowser();
		eb.pack();
		eb.setLocationRelativeTo(null);
		eb.setVisible(true);
		eb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	String[] titles = {
		"Euler 1","Euler 2","Euler 3","Euler 4","Euler 5","Euler 6","Euler 7","Euler 8","Euler 9",
		"Euler 10","Euler 11","Euler 12","Euler 13","Euler 14","Euler 15","Euler 16","Euler 17","Euler 18","Euler 19",
		"Euler 20","Euler 21","Euler 22","Euler 25","Euler 48"
	};
	Euler[] eulers = {
		new Euler_1(),new Euler_2(),new Euler_3(),new Euler_4(),new Euler_5(),new Euler_6(),new Euler_7(),new Euler_8(),new Euler_9(),
		new Euler_10(),new Euler_11(),new Euler_12(),new Euler_13(),new Euler_14(),new Euler_15(),new Euler_16(),new Euler_17(),new Euler_18(),new Euler_19(),
		new Euler_20(),new Euler_21(),new Euler_22(),null,null,new Euler_25(),null,null,null,null,
		null,null,null,null,null,null,null,null,null,null,
		null,null,null,null,null,null,null,null,new Euler_48()
	};
	public EulerBrowser() {
		setLayout(new GridLayout(5,5));
		for(int i = 0; i < titles.length; i++) {
			Button b = new Button(titles[i]);
			b.setActionCommand(titles[i]);
			add(b);
			b.addActionListener(this);
		}
	}

	public void actionPerformed(ActionEvent ae) {
		String st = ae.getActionCommand().substring(6,ae.getActionCommand().length());
		try {	int i = Integer.parseInt(st)-1;
			String[] s = eulers[i].solve();
			JOptionPane.showMessageDialog(null, s[0] + " " + s[1]);
		} catch(Exception e) {e.printStackTrace();}
	}
}