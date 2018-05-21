package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a2s.Applet;
import a2s.Button;
import a2s.Label;
import a2s.Panel;

public class TApp extends Applet {
	Label tl;

	public void init() {
		add(new MyPanel());
	}
	
	public void textIt() {
		System.out.println("OK2");
		tl.setText("OK");
	}
	
	class MyPanel extends Panel {
		
		public void test1() {
			System.out.println("test1");
		}
		public MyPanel() {
			tl = new Label("HALLO");
			Button bt = new Button("OK");
			bt.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("OK1");
					test1();
					textIt();
				}
			});
			add(tl);
			add(bt);
		}
	}
}