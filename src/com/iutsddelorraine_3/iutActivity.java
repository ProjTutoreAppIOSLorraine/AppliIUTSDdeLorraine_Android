package com.iutsddelorraine_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
 
public class iutActivity extends Activity{
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.iut);
    
}
  
  public void click(View v) {
	  Intent click = new Intent(this, MainActivity.class);
	  this.startActivity(click);	  
		  
	  }

}
  
