package com.gtrdp.pulsameter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Setting extends ListActivity {

	String Menu[] = {	"Tarif Telpon SMS",
						"Isi Pulsa Fisik",
						"Periode Berlangganan Paket"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , Menu));
	}
	
}
