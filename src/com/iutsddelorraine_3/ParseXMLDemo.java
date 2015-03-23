package com.iutsddelorraine_3;
 
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
 
public class ParseXMLDemo extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
 
        String xml = ParseXMLMethods.getXML();
        Document doc = ParseXMLMethods.XMLfromString(xml);
        
 
        int numResults = ParseXMLMethods.numResults(doc);
 
        if((numResults <= 0)){
            Toast.makeText(ParseXMLDemo.this, "There is no data in the xml file", Toast.LENGTH_LONG).show();
            finish();
        }
 
        NodeList children = doc.getElementsByTagName("os");
 
        for (int i = 0; i < children.getLength(); i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            Element e = (Element)children.item(i);
            map.put("id", ParseXMLMethods.getValue(e, "id"));
            map.put("name", ParseXMLMethods.getValue(e, "name"));
            map.put("site", ParseXMLMethods.getValue(e, "site"));
            mylist.add(map);
        }
 
        ListAdapter adapter = new SimpleAdapter(this, mylist , R.layout.list_layout,
                        new String[] { "name", "site" },
                        new int[] { R.id.title, R.id.subtitle});
 
        setListAdapter(adapter);
 
        final ListView lv = getListView();
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                @SuppressWarnings("unchecked")
                HashMap<String, String> o = (HashMap<String, String>) lv.getItemAtPosition(position);
                Toast.makeText(ParseXMLDemo.this,o.get("name"), Toast.LENGTH_LONG).show();
            }
        });
    }
    
    public void click(View v) {
  	  Intent click = new Intent(this, connecteActivity.class);
  	  this.startActivity(click);	  
  		  
  	  }
}