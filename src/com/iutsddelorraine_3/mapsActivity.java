package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.content.Intent;
 
public class mapsActivity extends Activity{
	
	private WebView webView;
	 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps);
		
		
		// Instanciation du WebView...
        WebView wvSite = (WebView)findViewById(R.id.webkit);
 
        //...on active JavaScript...
        WebSettings webSettings = wvSite.getSettings();
        webSettings.setJavaScriptEnabled(true);
 
        //...et on charge la page
        wvSite.loadUrl("file:///android_asset/carte.jpg");
 
	}
    
    
    public void click(View v) {
  	  
  	  Intent click = new Intent(this, connecteActivity.class);
  	  this.startActivity(click);	  
  		  
  	  }
}
