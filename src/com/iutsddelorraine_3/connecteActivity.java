package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
 
public class connecteActivity extends Activity{
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.connecte); 
    
    final Button button = (Button) findViewById(R.id.button1);
    
    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
	Boolean test_connection = prefs.getBoolean("stay_connected", false);
    
	if (test_connection==true) {
		button.setText("Rester connecté : ON");
	}
	else {
		button.setText("Rester connecté : OFF");
	}
  }
    
	  
  
public void click(View v) {
	  
	  Intent click = new Intent(this, MainActivity.class);
	  this.startActivity(click);	  
		  
	  }

public void click_edt(View v) {
	  
	  Intent click_edt = new Intent(this, edtActivity.class);
	  this.startActivity(click_edt);	  
		  
	  }

public void click_news(View v) {
	  
	  Intent click_news = new Intent(this, ParseXMLDemo.class);
	  this.startActivity(click_news);	  
		  
	  }

public void click_maps(View v) {
	  
	  Intent click_maps = new Intent(this, mapsActivity.class);
	  this.startActivity(click_maps);	  
		  
	  }

public void click_connecte(View v) {
	
	final Button button = (Button) findViewById(R.id.button1);
    
	SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
	Boolean test_connection = prefs.getBoolean("stay_connect", false);
	
	if (test_connection==false) {
		button.setText("Rester connecté : ON");
		SharedPreferences.Editor editor=prefs.edit();
        editor.putBoolean("stay_connect", true);
        editor.commit();
    	test_connection = prefs.getBoolean("stay_connect", false);
  	  //Toast toast=Toast.makeText(this,String.valueOf(test_connection),Toast.LENGTH_LONG);
  	  //toast.show();
	}
	else {
		button.setText("Rester connecté : OFF");
		SharedPreferences.Editor editor=prefs.edit();
        editor.putBoolean("stay_connect", false);
        editor.commit();
    	test_connection = prefs.getBoolean("stay_connect", false);
  	  //Toast toast=Toast.makeText(this,String.valueOf(test_connection),Toast.LENGTH_LONG);
  	  //toast.show();
	}
		  
	  }

}
  
