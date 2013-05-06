package com.gtrdp.pulsameter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		//button onclick listener
		Button btnOK = (Button)findViewById(R.id.btnOK);
		btnOK.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent openMain = new Intent("com.gtrdp.pulsameter.PULSAMETER");
				startActivity(openMain);
			}
		});
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
