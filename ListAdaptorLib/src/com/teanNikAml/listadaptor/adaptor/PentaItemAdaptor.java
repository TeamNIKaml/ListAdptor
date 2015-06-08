package com.teanNikAml.listadaptor.adaptor;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.teanNikAml.listadaptor.activity.R;
import com.teanNikAml.listadaptor.model.PentaItem;

public class PentaItemAdaptor extends BaseAdapter {

	private Context context;
	private List<PentaItem> pentaItemList;
	private String backgroundColor, textColor;

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public List<PentaItem> getPentaItemList() {
		return pentaItemList;
	}

	public void setPentaItemList(List<PentaItem> pentaItemList) {
		this.pentaItemList = pentaItemList;
	}

	public PentaItemAdaptor(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pentaItemList.size();
	}

	@Override
	public Object getItem(int postion) {
		// TODO Auto-generated method stub
		return pentaItemList.get(postion);
	}

	@Override
	public long getItemId(int postion) {
		// TODO Auto-generated method stub
		return pentaItemList.get(postion).hashCode();
	}

	

	@Override
	public View getView(int postion, View convertView, ViewGroup group) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;

		if (convertView == null) {

			LayoutInflater li = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.penta_item, group, false);
			convertView.setBackgroundColor(Color.parseColor(backgroundColor));
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
			holder.tv2 = (TextView) convertView.findViewById(R.id.item2);
			holder.tv3 = (TextView) convertView.findViewById(R.id.item3);
			holder.tv4 = (TextView) convertView.findViewById(R.id.item4);
			holder.tv5 = (TextView) convertView.findViewById(R.id.item5);
			
			
			
			holder.tv1.setTextColor(Color.parseColor(textColor));
			holder.tv2.setTextColor(Color.parseColor(textColor));
			holder.tv3.setTextColor(Color.parseColor(textColor));
			holder.tv4.setTextColor(Color.parseColor(textColor));
			holder.tv5.setTextColor(Color.parseColor(textColor));
			

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.tv1.setText(pentaItemList.get(postion).getItem1());
		holder.tv2.setText(pentaItemList.get(postion).getItem2());
		holder.tv3.setText(pentaItemList.get(postion).getItem3());
		holder.tv4.setText(pentaItemList.get(postion).getItem4());
		holder.tv5.setText(pentaItemList.get(postion).getItem5());

		return convertView;
	}

	static class ViewHolder {
		private TextView tv1, tv2, tv3, tv4,tv5;

	}

}
