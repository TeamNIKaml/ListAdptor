package com.teanNikAml.listadaptor.model;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.teanNikAml.listadaptor.adaptor.QuadItemAdaptor;

public class Mapper {
	
	private Context context;
	
	
	public Mapper(Context context) {
		super();
		this.context = context;
	}	
	
	public BaseAdapter getAdapter(List<Object> ItemList)	{
		
		
		
		if(ItemList.get(0) instanceof QuadItem)
		{
			
			QuadItem quadItem;
			List<QuadItem> quadItemList = new ArrayList<QuadItem>();
			
		QuadItemAdaptor quadItemAdaptor = new QuadItemAdaptor(context);
		
		for(int i=0;i<ItemList.size();i++)
		{
			quadItem = (QuadItem) ItemList.get(i);
			quadItemList.add(quadItem);
			
		}
		
		quadItemAdaptor.setQuadItemList(quadItemList);
		return quadItemAdaptor;
		}
		
		return new BaseAdapter() {
			
			@Override
			public View getView(int arg0, View arg1, ViewGroup arg2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getItemId(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	

}
