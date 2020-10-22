package com.falstad;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.util.ArrayList;

public class JRadioButtonMenuItem extends CheckboxMenuItem {

	public ButtonGroup group;
	
	public JRadioButtonMenuItem(String s) {
		super(s);
	}

	public boolean selected() {
		return getState();
	}
	public void select(boolean b) {
		if (b && group != null)
			group.set(this);
		setState(b);
	}

}