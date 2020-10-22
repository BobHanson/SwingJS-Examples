package com.falstad;

import java.util.ArrayList;

public class ButtonGroup {
	ArrayList<JRadioButtonMenuItem> items = new ArrayList<>();
	
	public void add(JRadioButtonMenuItem item) {
		items.add(item);
		item.group = this;
	}
	
	public void set(JRadioButtonMenuItem item) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) != item) {
				items.get(i).select(false);
			}
		}
	}

	public JRadioButtonMenuItem getSelection() {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).selected()) {
				return items.get(i);
			}
		}
		return null;
	}

}
