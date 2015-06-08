package com.teanNikAml.listadaptor.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.teanNikAml.listadaptor.model.Mapper;
import com.teanNikAml.listadaptor.model.SingleItem;

public class MainActivity extends Activity {

	private ListView listView;

	private Mapper mapper;

	private List<Object> ItemList;
	
	//v.setBackgroundColor(context.getResources().getColor(R.color.enquiries_list_background));

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		listView = (ListView) findViewById(R.id.listView1);

		mapper = new Mapper(getApplicationContext());

		setData();
		
		mapper.setBackGroundColor("#8ba76b");
		mapper.setTextColor("#ffffff");

		listView.setAdapter(mapper.getAdapter(ItemList));
		
		
	}

	private void setData() {
		// TODO Auto-generated method stub
		ItemList = new ArrayList<Object>();
		
		System.out.println("setdata");
		
		
		SingleItem singleItem;

		for (int i = 0; i < 15; i++) {
			singleItem = new SingleItem();
			singleItem.setItem("item "+String.valueOf(i));
			ItemList.add(singleItem);
		}
		
		
		
		/*DualItem dualItem;

		for (int i = 0; i < 15; i++) {
			dualItem = new DualItem();
			dualItem.setItem1("item1 " + String.valueOf(i));
			dualItem.setItem2("item2 " + String.valueOf(i));
			

			ItemList.add(dualItem);
		}*/
		
		
		
	/*	TripleItem tripleItem;

		for (int i = 0; i < 15; i++) {
			tripleItem = new TripleItem();
			tripleItem.setItem1("item1 " + String.valueOf(i));
			tripleItem.setItem2("item2 " + String.valueOf(i));
			tripleItem.setItem3("item3 " + String.valueOf(i));
			

			ItemList.add(tripleItem);
		}*/
		
		
		/*QuadItem quadItem;

		for (int i = 0; i < 15; i++) {
			quadItem = new QuadItem();
			quadItem.setItem1("item1 " + String.valueOf(i));
			quadItem.setItem2("item2 " + String.valueOf(i));
			quadItem.setItem3("item3 " + String.valueOf(i));
			quadItem.setItem4("item4 " + String.valueOf(i));

			ItemList.add(quadItem);
		}*/
		
		/*	PentaItem pentaItem;
		for (int i = 0; i < 15; i++) {
			pentaItem = new PentaItem();
			pentaItem.setItem1("item1 " + String.valueOf(i));
			pentaItem.setItem2("item2 " + String.valueOf(i));
			pentaItem.setItem3("item3 " + String.valueOf(i));
			pentaItem.setItem4("item4 " + String.valueOf(i));
			pentaItem.setItem5("item5 " + String.valueOf(i));
			ItemList.add(pentaItem);
		}*/
		
	/*ItemEditTextCheckbox itemEditTextCheckbox;
		
		Boolean b;
		
		for (int i = 0; i < 15; i++) {
			itemEditTextCheckbox = new ItemEditTextCheckbox();
			
			if(i%2==0)
				b = true;
			else
				b = false;
			
			itemEditTextCheckbox.setCheckboxItem(b);
		//	itemEditTextCheckbox.setItemEdittext("edit text");
			itemEditTextCheckbox.setItemTextView("text view");
			ItemList.add(itemEditTextCheckbox);
			
		}*/
		
		System.out.println(ItemList.size());
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
