package com.gtrdp.pulsameter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class PulsaInternet extends ListActivity {

	String Menu[] = {	"Cek Penggunaan Data",
						"Cek Saldo",
						"Cek Beli Paket"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , Menu));
	}
	
}
