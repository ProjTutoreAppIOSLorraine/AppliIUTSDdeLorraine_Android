package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.webkit.WebView;
 
public class ajout_newsActivity extends Activity{

	String url;
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.facebook);  

	url = "http://courtil-antoine.fr/PT/administrator/";
	
    WebView navig;
    navig = (WebView)findViewById(R.id.webkit);
    navig.loadUrl(url);
    
	  }
  
  
public void click(View v) {
	  
	  Intent click = new Intent(this, connecteActivity.class);
	  this.startActivity(click);	  
		  
	  }

}
  
