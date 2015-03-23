package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

 
public class MainActivity extends Activity implements View.OnClickListener {
		private ImageView boutonidentification = null;
		private ImageView boutoniut = null;
	 	private ImageView boutonplan = null;
	 	private ImageView boutongeii = null;
	 	private ImageView boutonmmi = null;
	 	private ImageView boutoninfo = null;
	 	private ImageView boutonfb = null;
	 	private ImageView boutontwitter = null;
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    
    boutonidentification = (ImageView) findViewById(R.id.identification);
    boutonidentification.setOnClickListener(this);
    
    boutoniut = (ImageView) findViewById(R.id.iut);
    boutoniut.setOnClickListener(this);
    
    boutonplan = (ImageView) findViewById(R.id.plan);
    boutonplan.setOnClickListener(this);
    
    boutongeii = (ImageView) findViewById(R.id.geii);
    boutongeii.setOnClickListener(this);
    
    boutonmmi = (ImageView) findViewById(R.id.src);
    boutonmmi.setOnClickListener(this);
    
    boutoninfo = (ImageView) findViewById(R.id.info);
    boutoninfo.setOnClickListener(this);
    
    boutontwitter = (ImageView) findViewById(R.id.twitter);
    boutontwitter.setOnClickListener(this);

    boutonfb = (ImageView) findViewById(R.id.fb);
    boutonfb.setOnClickListener(this);
    
    
   
  }
  
 
  public void onClick(View v) {
	  if(v == boutonidentification){
		  
		  SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		  Boolean test_connection = prefs.getBoolean("stay_connect", true);
		  //Toast toast=Toast.makeText(this,String.valueOf(test_connection),Toast.LENGTH_LONG);
			//toast.show();
			
		  if (test_connection==false) {
			  Intent identification = new Intent(this, identificationActivity.class);
			  this.startActivity(identification);
		  }
		  else {
			  Intent identification = new Intent(this, connecteActivity.class);
			  this.startActivity(identification);
		  }
		  
		  
	  }else if(v == boutoniut){
		  Intent iut = new Intent(this, iutActivity.class);
		  this.startActivity(iut);
	  }else if(v == boutonplan){
		  Intent plan = new Intent(this, planActivity.class);
		  this.startActivity(plan);
	  }else if(v == boutongeii){
		  Intent geii = new Intent(this, geiiActivity.class);
		  this.startActivity(geii);
	  }else if(v == boutonmmi){
		  Intent mmi = new Intent(this, mmiActivity.class);
		  this.startActivity(mmi);
	  }else if(v == boutoninfo){
		  Intent info = new Intent(this, infoActivity.class);
		  this.startActivity(info);
	  }else if(v == boutonfb){
		  Intent fb = new Intent(this, facebookActivity.class);
		  this.startActivity(fb);
	  }else if(v == boutontwitter){
		  Intent twitter = new Intent(this, twitterActivity.class);
		  this.startActivity(twitter);
	  }
	 
  }
 
}
