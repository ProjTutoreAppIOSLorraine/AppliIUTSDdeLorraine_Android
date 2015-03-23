package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebSettings;
 
public class facebookActivity extends Activity{

	private WebView webView;
	 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);
		
		
		// Instanciation du WebView...
        WebView wvSite = (WebView)findViewById(R.id.webkit);
 
        //...on active JavaScript...
        WebSettings webSettings = wvSite.getSettings();
        webSettings.setJavaScriptEnabled(true);
 
        //...et on charge la page
        wvSite.loadUrl("http://m.facebook.com/AppliIUTSD");
 
	}

  
  
public void click(View v) {
	  
	  Intent click = new Intent(this, MainActivity.class);
	  this.startActivity(click);	  
		  
	  }

}
  
