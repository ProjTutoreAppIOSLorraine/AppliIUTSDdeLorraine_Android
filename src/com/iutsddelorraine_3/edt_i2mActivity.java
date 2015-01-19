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
 
public class edt_i2mActivity extends Activity
implements View.OnClickListener{
	
	int numsemaine;
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
	numsemaine = (date+18)%51;
	datestring = String.valueOf(numsemaine);
	url = "http://kerrecherche.iutsd.uhp-nancy.fr/~edtIUTSD/edt.php?week=" + datestring + "&idTree=59050,59051,59052,59054,59055,59056,59058,59059,59062,59063,59064,59066,59067,59068,59070,59487,59488,59490,59491,59492,59494,59495,59496,59498,59499,59500,59503,59504,59505,59507,59508,59509,59511,59512,59513,59515,59516,59517,59519,59520,59521,59523,59524,59525&width=2000&height=420&displayMode=1057855&displayConfId=127";
	
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
		url = "http://kerrecherche.iutsd.uhp-nancy.fr/~edtIUTSD/edt.php?week=" + datestring + "&idTree=5933&width=2000&height=420&displayMode=1057855&displayConfId=127";

		WebView navig;
		navig = (WebView)findViewById(R.id.webkit);
		navig.loadUrl(url);
	
	}else if(v==b2){
		numsemaine = numsemaine + 1;
		datestring = String.valueOf(numsemaine);
		url = "http://kerrecherche.iutsd.uhp-nancy.fr/~edtIUTSD/edt.php?week=" + datestring + "&idTree=5933&width=2000&height=420&displayMode=1057855&displayConfId=127";

		WebView navig;
		navig = (WebView)findViewById(R.id.webkit);
		navig.loadUrl(url);
	}
	    
}


}
  
