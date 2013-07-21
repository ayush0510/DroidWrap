package com.android_text_editor;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener
{

	
	TextView textOut;
	EditText getInput;
	RadioGroup Gunit;
	RadioGroup Sunit;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Sunit = (RadioGroup) findViewById(R.id.rgStyle);
		Sunit.setOnCheckedChangeListener(this);
		Gunit = (RadioGroup) findViewById(R.id.rgGravity);
		Gunit.setOnCheckedChangeListener(this);
		
		textOut = (TextView) findViewById(R.id.tvGetInput);
		getInput = (EditText) findViewById(R.id.etInput);		
		Button ok = (Button) findViewById(R.id.bOk);
		ok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				textOut.setText(getInput.getText());
			
			}
		});
			
		}


	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId){
		case R.id.rb4:
			textOut.setGravity(Gravity.LEFT);
			break;
		case R.id.rb2:
			textOut.setGravity(Gravity.RIGHT);
			break;
		case R.id.rb3:
			textOut.setGravity(Gravity.CENTER);
			break;
		case R.id.rb1:
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL), Typeface.NORMAL);
			break;
		case R.id.rb5:
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD), Typeface.BOLD);
			break;
		case R.id.rb6:
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
			break;
		}
	}
	
    
	





}
	
	

