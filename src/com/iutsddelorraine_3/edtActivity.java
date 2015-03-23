package com.iutsddelorraine_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
 
public class edtActivity extends Activity{
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.edt);  
    
	  }
  
public void click(View v) {
	  
	  Intent click = new Intent(this, connecteActivity.class);
	  this.startActivity(click);	  
		  
	  }

public void click_mmi_1a(View v) {
	  
	  Intent click_mmi_1a = new Intent(this, edt_mmi_1aActivity.class);
	  this.startActivity(click_mmi_1a);	  
		  
	  }

public void click_mmi_2a(View v) {
	  
	  Intent click_mmi_2a = new Intent(this, edt_mmi_2aActivity.class);
	  this.startActivity(click_mmi_2a);	  
		  
	  }

public void click_geii_1a(View v) {
	  
	  Intent click_geii_1a = new Intent(this, edt_geii_1aActivity.class);
	  this.startActivity(click_geii_1a);	  
		  
	  }

public void click_geii_2a(View v) {
	  
	  Intent click_geii_2a = new Intent(this, edt_geii_2aActivity.class);
	  this.startActivity(click_geii_2a);	  
		  
	  }

public void click_info_1a(View v) {
	  
	  Intent click_info_1a = new Intent(this, edt_info_1aActivity.class);
	  this.startActivity(click_info_1a);	  
		  
	  }

public void click_info_2a(View v) {
	  
	  Intent click_info_2a = new Intent(this, edt_info_2aActivity.class);
	  this.startActivity(click_info_2a);	  
		  
	  }

public void click_a2i(View v) {
	  
	  Intent click_a2i = new Intent(this, edt_a2iActivity.class);
	  this.startActivity(click_a2i);	  
		  
	  }

public void click_cds(View v) {
	  
	  Intent click_cds = new Intent(this, edt_cdsActivity.class);
	  this.startActivity(click_cds);	  
		  
	  }

public void click_i2m(View v) {
	  
	  Intent click_i2m = new Intent(this, edt_i2mActivity.class);
	  this.startActivity(click_i2m);	  
		  
	  }

public void click_isn(View v) {
	  
	  Intent click_isn = new Intent(this, edt_isnActivity.class);
	  this.startActivity(click_isn);	  
		  
	  }

public void click_tecamtv(View v) {
	  
	  Intent click_tecamtv = new Intent(this, edt_tecamtvActivity.class);
	  this.startActivity(click_tecamtv);	  
		  
	  }

}
  
