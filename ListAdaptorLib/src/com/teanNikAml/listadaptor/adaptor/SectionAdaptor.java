package com.teanNikAml.listadaptor.adaptor;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.teanNikAml.listadaptor.activity.R;
import com.teanNikAml.listadaptor.model.DualItem;
import com.teanNikAml.listadaptor.model.PentaItem;
import com.teanNikAml.listadaptor.model.QuadItem;
import com.teanNikAml.listadaptor.model.SingleItem;
import com.teanNikAml.listadaptor.model.TripleItem;

public class SectionAdaptor extends BaseAdapter {

	private Context context;

	private int backGroundColor, textColor;
	private int backgroundColorHeading, textColorHeading;
	private List<Object> ItemList;

	

	public int getBackGroundColor() {
		return backGroundColor;
	}

	public void setBackGroundColor(int backGroundColor) {
		this.backGroundColor = backGroundColor;
	}

	public int getTextColor() {
		return textColor;
	}

	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}

	public int getBackgroundColorHeading() {
		return backgroundColorHeading;
	}

	public void setBackgroundColorHeading(int backgroundColorHeading) {
		this.backgroundColorHeading = backgroundColorHeading;
	}

	public int getTextColorHeading() {
		return textColorHeading;
	}

	public void setTextColorHeading(int textColorHeading) {
		this.textColorHeading = textColorHeading;
	}

	public List<Object> getItemList() {
		return ItemList;
	}

	public void setItemList(List<Object> itemList) {
		ItemList = itemList;
	}

	public SectionAdaptor(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ItemList.size();
	}

	@Override
	public Object getItem(int postion) {
		// TODO Auto-generated method stub
		return ItemList.get(postion);
	}

	@Override
	public long getItemId(int postion) {
		// TODO Auto-generated method stub
		return ItemList.get(postion).hashCode();
	}

	@Override
	public View getView(int postion, View convertView, ViewGroup group) {
		// TODO Auto-generated method stub
		
		ViewHolder holder = null;
		LayoutInflater li = LayoutInflater.from(context);

		if (ItemList.get(postion) instanceof String) {
			
			convertView = li.inflate(R.layout.single_item, group, false);

			convertView.setBackgroundColor(backgroundColorHeading);
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);

			holder.tv1.setTextColor(textColorHeading);
			
		
			
			System.out.println("tv1:"+ItemList.get(postion));
			
			holder.tv1.setText((String)ItemList.get(postion));
			

		} else if(ItemList.get(postion) instanceof SingleItem) {
			
			SingleItem singleItem;
			
			convertView = li.inflate(R.layout.single_item, group, false);

			convertView.setBackgroundColor(backGroundColor);
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);

			holder.tv1.setTextColor(textColor);
			
			singleItem =(SingleItem) ItemList.get(postion);
			holder.tv1.setText(singleItem.getItem());

		} else if(ItemList.get(postion) instanceof DualItem) {
			
			
			convertView = li.inflate(R.layout.dual_item, group, false);
			
			convertView.setBackgroundColor(backGroundColor);

			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
			holder.tv2 = (TextView) convertView.findViewById(R.id.item2);

			holder.tv1.setTextColor(textColor);
			holder.tv2.setTextColor(textColor);
			DualItem dualItem = (DualItem)ItemList.get(postion);
			holder.tv1.setText(dualItem.getItem1());
			holder.tv2.setText(dualItem.getItem2());
			
		}
			else if(ItemList.get(postion) instanceof TripleItem) {
			
				convertView = li.inflate(R.layout.triple_item, group, false);
				convertView.setBackgroundColor(backGroundColor);
				holder = new ViewHolder();

				holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
				holder.tv2 = (TextView) convertView.findViewById(R.id.item2);
				holder.tv3 = (TextView) convertView.findViewById(R.id.item3);

				holder.tv1.setTextColor(textColor);
				holder.tv2.setTextColor(textColor);
				holder.tv3.setTextColor(textColor);
				
				TripleItem tripleItem = (TripleItem) ItemList.get(postion);
				holder.tv1.setText(tripleItem.getItem1());
				holder.tv2.setText(tripleItem.getItem2());
				holder.tv3.setText(tripleItem.getItem3());
				
		}
			else if(ItemList.get(postion) instanceof QuadItem) {
				
				convertView = li.inflate(R.layout.quad_item, group, false);
				convertView.setBackgroundColor(backGroundColor);
				holder = new ViewHolder();

				holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
				holder.tv2 = (TextView) convertView.findViewById(R.id.item2);
				holder.tv3 = (TextView) convertView.findViewById(R.id.item3);
				holder.tv4 = (TextView) convertView.findViewById(R.id.item4);
				
				
				holder.tv1.setTextColor(textColor);
				holder.tv2.setTextColor(textColor);
				holder.tv3.setTextColor(textColor);
				holder.tv4.setTextColor(textColor);
				
				QuadItem quadItem = (QuadItem) ItemList.get(postion);
				holder.tv1.setText(quadItem.getItem1());
				holder.tv2.setText(quadItem.getItem2());
				holder.tv3.setText(quadItem.getItem3());
				holder.tv4.setText(quadItem.getItem4());
				
			}
			else if(ItemList.get(postion) instanceof PentaItem) {
				
				convertView = li.inflate(R.layout.penta_item, group, false);
				convertView.setBackgroundColor(backGroundColor);
				holder = new ViewHolder();

				holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
				holder.tv2 = (TextView) convertView.findViewById(R.id.item2);
				holder.tv3 = (TextView) convertView.findViewById(R.id.item3);
				holder.tv4 = (TextView) convertView.findViewById(R.id.item4);
				holder.tv5 = (TextView) convertView.findViewById(R.id.item5);
				
				
				
				holder.tv1.setTextColor(textColor);
				holder.tv2.setTextColor(textColor);
				holder.tv3.setTextColor(textColor);
				holder.tv4.setTextColor(textColor);
				holder.tv5.setTextColor(textColor);
				
				
				PentaItem pentaItem = (PentaItem) ItemList.get(postion);
				holder.tv1.setText(pentaItem.getItem1());
				holder.tv2.setText(pentaItem.getItem2());
				holder.tv3.setText(pentaItem.getItem3());
				holder.tv4.setText(pentaItem.getItem4());
				holder.tv5.setText(pentaItem.getItem5());
				
				
			}

		return convertView;
	}

	private static class ViewHolder {
		private TextView tv1, tv2, tv3, tv4, tv5;

	}

}
