package com.teanNikAml.listadaptor.adaptor;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.teanNikAml.listadaptor.activity.R;
import com.teanNikAml.listadaptor.model.SingleItem;

public class SingleItemAdaptor extends BaseAdapter {

	private Context context;
	private List<SingleItem> singleItemList;

	public SingleItemAdaptor(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return singleItemList.size();
	}

	@Override
	public Object getItem(int postion) {
		// TODO Auto-generated method stub
		return singleItemList.get(postion);
	}

	@Override
	public long getItemId(int postion) {
		// TODO Auto-generated method stub
		return singleItemList.get(postion).hashCode();
	}

	public List<SingleItem> getSingleItemList() {
		return singleItemList;
	}

	public void setSingleItemList(List<SingleItem> singleItemList) {
		this.singleItemList = singleItemList;
	}

	@Override
	public View getView(int postion, View convertView, ViewGroup group) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;

		if (convertView == null) {

			LayoutInflater li = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.single_item, group, false);
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.tv1.setText(singleItemList.get(postion).getItem());
		return convertView;
	}

	static class ViewHolder {
		private TextView tv1;

	}

}
