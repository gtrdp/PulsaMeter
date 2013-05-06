package com.gtrdp.pulsameter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PulsaMeter extends ListActivity {

	String Menu[] = {"PulsaReguler", "PulsaInternet", "Setting"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(PulsaMeter.this, android.R.layout.simple_list_item_1 , Menu));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String foo = Menu[position];
		
		try{
			Class ourClass = Class.forName("com.gtrdp.pulsameter." + foo);
			Intent ourIntent = new Intent(PulsaMeter.this, ourClass);
			startActivity(ourIntent);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
}
