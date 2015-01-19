package com.iutsddelorraine_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.TextView;
import android.util.Log;
 
public class edt_mmi_2aActivity extends Activity
implements View.OnClickListener{
	
	int numsemaine;
	String date2;
	String datestring;
	String url;
	private TextView b1 = null;
	private TextView b2 = null;
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.affiche_edt);  
    
    GregorianCalendar calendar = new GregorianCalendar();
    int date = calendar.get(java.util.GregorianCalendar.WEEK_OF_YEAR);
	date2 = String.valueOf(date);
	numsemaine = (date+18)%51;
	datestring = String.valueOf(numsemaine);
	Log.v("Essai", date2);	
	url = "http://kerrecherche.iutsd.uhp-nancy.fr/edt/edt.php?week=" + datestring + "&idTree=63204,63205,63206,63208,165617,165618,165619&width=2000&height=420&displayMode=1057855&displayConfId=127";
	
    WebView navig;
    navig = (WebView)findViewById(R.id.webkit);
    navig.loadUrl(url);
    
    b1 = (TextView) findViewById(R.id.bouton_prec);
    b1.setOnClickListener(this);
    b2 = (TextView) findViewById(R.id.bouton_suiv);
    b2.setOnClickListener(this);
    
    
	  }
  
  
public void click(View v) {
	  
	  Intent click = new Intent(this, edtActivity.class);
	  this.startActivity(click);	  
		  
	  }


@Override
public void onClick(View v) {
	
	if(v==b1){
		numsemaine = numsemaine - 1;
		datestring = String.valueOf(numsemaine);
		url = "http://kerrecherche.iutsd.uhp-nancy.fr/edt/edt.php?week=" + datestring + "&idTree=63204,63205,63206,63208,165617,165618,165619&width=2000&height=420&displayMode=1057855&displayConfId=127";

		WebView navig;
		navig = (WebView)findViewById(R.id.webkit);
		navig.loadUrl(url);
	
	}else if(v==b2){
		numsemaine = numsemaine + 1;
		datestring = String.valueOf(numsemaine);
		url = "http://kerrecherche.iutsd.uhp-nancy.fr/edt/edt.php?week=" + datestring + "&idTree=63204,63205,63206,63208,165617,165618,165619&width=2000&height=420&displayMode=1057855&displayConfId=127";

		WebView navig;
		navig = (WebView)findViewById(R.id.webkit);
		navig.loadUrl(url);
	}
	    
}


}
  
