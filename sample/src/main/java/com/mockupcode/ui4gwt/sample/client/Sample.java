package com.mockupcode.ui4gwt.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Sample implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new Label("xxx"));
		
	}

}
