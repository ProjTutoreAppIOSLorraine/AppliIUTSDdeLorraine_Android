package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
 
public class connecteActivity extends Activity{
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.connecte);  
    
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

public void click_reglages(View v) {
	  
	  Intent click_reglages = new Intent(this, ajout_newsActivity.class);
	  this.startActivity(click_reglages);	  
		  
	  }

}
  
