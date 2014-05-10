package com.hamedjj.bazaarinappbilling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CustomPremium extends Activity {
	
	Button btn5;
	Button btn4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custompremium);
		updatebtn();
		btn4 = (Button) findViewById(R.id.custombtn);
		btn5 = (Button) findViewById(R.id.Activebtn);
		
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(CustomPremium.this, PurchaseApp.class));
			}
		});
	}
	
	public void updatebtn() {
		btn5 = (Button) findViewById(R.id.Activebtn);
		
		if (PurchaseApp.mIsPremium2) {
			btn5.setEnabled(true);
			btn5.setBackgroundResource(R.drawable.button_normal);
			btn5.setOnClickListener(new OnClickListener() {				
				@Override
				public void onClick(View arg0) {
					Toast.makeText(getApplicationContext(), R.string.active, Toast.LENGTH_SHORT).show();
				}
			});	
			
		findViewById(R.id.custombtn).setEnabled(false);
		
		}else {
			return;
		}
	}
}
