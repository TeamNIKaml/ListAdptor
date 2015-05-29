package com.teanNikAml.listadaptor.adaptor;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.teanNikAml.listadaptor.activity.R;
import com.teanNikAml.listadaptor.model.QuadItem;
import com.teanNikAml.listadaptor.model.TripleItem;

public class TripleItemAdaptor  extends BaseAdapter {

	private Context context;
	private List<TripleItem> itemList;

	public TripleItemAdaptor(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return itemList.size();
	}

	@Override
	public Object getItem(int postion) {
		// TODO Auto-generated method stub
		return itemList.get(postion);
	}

	@Override
	public long getItemId(int postion) {
		// TODO Auto-generated method stub
		return itemList.get(postion).hashCode();
	}

	

	public List<TripleItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<TripleItem> itemList) {
		this.itemList = itemList;
	}

	@Override
	public View getView(int postion, View convertView, ViewGroup group) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;

		if (convertView == null) {

			LayoutInflater li = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.triple_item, group, false);
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
			holder.tv2 = (TextView) convertView.findViewById(R.id.item2);
			holder.tv3 = (TextView) convertView.findViewById(R.id.item3);
		

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.tv1.setText(itemList.get(postion).getItem1());
		holder.tv2.setText(itemList.get(postion).getItem2());
		holder.tv3.setText(itemList.get(postion).getItem3());
		

		return convertView;
	}

	static class ViewHolder {
		private TextView tv1, tv2, tv3;

	}

}
