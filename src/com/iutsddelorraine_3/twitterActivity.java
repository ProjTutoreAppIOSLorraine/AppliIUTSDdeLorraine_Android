package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebSettings;
 
public class twitterActivity extends Activity{

    // Déclaration de la WebView
    private WebView myWebView;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter);
 
        // Déclaration de la page dans un fichier
        final String myHtmlCode= "<a class='twitter-timeline' data-dnt='true' href='https://twitter.com/AppIUTSD/lists/application-iutsd' data-widget-id='556870866601246721'>Tweets de https://twitter.com/AppIUTSD/lists/application-iutsd</a>"+
"<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document,'script','twitter-wjs');</script>";
 
        // On récupère notre WebView
         myWebView= (WebView) findViewById(R.id.webkit);
        // WebSettings webSettings = myWebView.getSettings();
         myWebView.getSettings().setDomStorageEnabled(true);
         myWebView.getSettings().setJavaScriptEnabled(true);
 
        // Chargement du HTML dans la WebView avec définition
        // du Mime Type et du type d'encodage comme dans un
        // fichier HTML de base (en général à déclarer dans le head)
         myWebView.loadData(myHtmlCode, "text/html", "utf-8");
    }
    
    
    public void click(View v) {
  	  
  	  Intent click = new Intent(this, MainActivity.class);
  	  this.startActivity(click);	  
  		  
  	  }
}