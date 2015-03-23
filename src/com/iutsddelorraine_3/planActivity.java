package com.iutsddelorraine_3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity; 
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class planActivity extends FragmentActivity {
	static final LatLng SAINTDIE = new LatLng(48.2901926, 6.942744);
	private GoogleMap map;
	

@Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.plan);
    map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
            .getMap();
    if (map!=null){
        Marker iut = map.addMarker(new MarkerOptions().position(SAINTDIE)
            .title("IUT de Saint-Dié"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(SAINTDIE, 15)); 
      }
  }
  
 
  protected boolean isRouteDisplayed() {
    return false;
  }

  
  protected boolean isLocationDisplayed() {
    return true;
  }
  
  public void click(View v) {
	  Intent click = new Intent(this, MainActivity.class);
	  this.startActivity(click);	  
		  
	  }
 
}
