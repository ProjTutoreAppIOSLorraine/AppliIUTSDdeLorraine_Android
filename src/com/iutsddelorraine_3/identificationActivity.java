package com.iutsddelorraine_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

 
public class identificationActivity extends Activity{
	
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.identification);

}
 
  
public void click(View v) {
	  
	  Intent click = new Intent(this, MainActivity.class);
	  this.startActivity(click);	
	  }
  
  public void click_connexion(View v) {
	  
	
	  EditText valuelogin = (EditText) findViewById(R.id.login);
	  EditText valuemdp = (EditText) findViewById(R.id.mdp);
	  String login = valuelogin.getText().toString();
	  String mdp = valuemdp.getText().toString();
	  
	  if(login.equals("iut") && mdp.equals("stdie")){
		  Intent click_connexion = new Intent(this, connecteActivity.class);
		  this.startActivity(click_connexion);	  
	  
	  }
	  }

}
