package com.teanNikAml.listadaptor.model;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.teanNikAml.listadaptor.adaptor.DualItemAdaptor;
import com.teanNikAml.listadaptor.adaptor.ItemEditTextCheckBoxAdaptor;
import com.teanNikAml.listadaptor.adaptor.PentaItemAdaptor;
import com.teanNikAml.listadaptor.adaptor.QuadItemAdaptor;
import com.teanNikAml.listadaptor.adaptor.SingleItemAdaptor;
import com.teanNikAml.listadaptor.adaptor.TripleItemAdaptor;

public class Mapper {

	private Context context;

	private String backGroundColor = "#FFFFFF", textColor = "#000000";

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getBackGroundColor() {
		return backGroundColor;
	}

	public void setBackGroundColor(String backGroundColor) {
		this.backGroundColor = backGroundColor;
	}

	public Mapper(Context context) {
		super();
		this.context = context;
	}

	public BaseAdapter getAdapter(List<Object> ItemList) {

		if (ItemList.get(0) instanceof QuadItem) {

			QuadItem quadItem;
			List<QuadItem> quadItemList = new ArrayList<QuadItem>();

			QuadItemAdaptor adaptor = new QuadItemAdaptor(context);

			for (int i = 0; i < ItemList.size(); i++) {
				quadItem = (QuadItem) ItemList.get(i);
				quadItemList.add(quadItem);

			}

			adaptor.setQuadItemList(quadItemList);
			adaptor.setBackgroundColor(backGroundColor);
			adaptor.setTextColor(textColor);

			return adaptor;
		} else if (ItemList.get(0) instanceof ItemEditTextCheckbox) {
			ItemEditTextCheckbox itemEditTextCheckbox;

			List<ItemEditTextCheckbox> itemList1 = new ArrayList<ItemEditTextCheckbox>();

			for (int i = 0; i < ItemList.size(); i++) {
				itemEditTextCheckbox = (ItemEditTextCheckbox) ItemList.get(i);
				itemList1.add(itemEditTextCheckbox);

			}

			ItemEditTextCheckBoxAdaptor adaptor = new ItemEditTextCheckBoxAdaptor(
					context, itemList1);
			adaptor.setBackgroundColor(backGroundColor);
			adaptor.setTextColor(textColor);

			return adaptor;

		}

		else if (ItemList.get(0) instanceof SingleItem) {
			SingleItem singleItem;

			List<SingleItem> itemList1 = new ArrayList<SingleItem>();

			for (int i = 0; i < ItemList.size(); i++) {
				singleItem = (SingleItem) ItemList.get(i);
				itemList1.add(singleItem);

			}

			SingleItemAdaptor adaptor = new SingleItemAdaptor(context);
			adaptor.setBackgroundColor(backGroundColor);
			adaptor.setTextColor(textColor);
			adaptor.setSingleItemList(itemList1);

			return adaptor;

		}

		else if (ItemList.get(0) instanceof DualItem) {
			DualItem dualItem;

			List<DualItem> itemList1 = new ArrayList<DualItem>();

			for (int i = 0; i < ItemList.size(); i++) {
				dualItem = (DualItem) ItemList.get(i);
				itemList1.add(dualItem);

			}

			DualItemAdaptor adaptor = new DualItemAdaptor(context);
			adaptor.setDualItemList(itemList1);
			adaptor.setBackgroundColor(backGroundColor);
			adaptor.setTextColor(textColor);

			return adaptor;

		}

		else if (ItemList.get(0) instanceof TripleItem) {
			TripleItem tripleItem;

			List<TripleItem> itemList1 = new ArrayList<TripleItem>();

			for (int i = 0; i < ItemList.size(); i++) {
				tripleItem = (TripleItem) ItemList.get(i);
				itemList1.add(tripleItem);

			}

			TripleItemAdaptor adaptor = new TripleItemAdaptor(context);
			adaptor.setItemList(itemList1);
			adaptor.setBackgroundColor(backGroundColor);
			adaptor.setTextColor(textColor);

			return adaptor;

		}

		else if (ItemList.get(0) instanceof PentaItem) {
			PentaItem pentaItem;

			List<PentaItem> itemList1 = new ArrayList<PentaItem>();

			for (int i = 0; i < ItemList.size(); i++) {
				pentaItem = (PentaItem) ItemList.get(i);
				itemList1.add(pentaItem);

			}

			PentaItemAdaptor adaptor = new PentaItemAdaptor(context);
			adaptor.setPentaItemList(itemList1);
			adaptor.setBackgroundColor(backGroundColor);
			adaptor.setTextColor(textColor);

			return adaptor;

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
