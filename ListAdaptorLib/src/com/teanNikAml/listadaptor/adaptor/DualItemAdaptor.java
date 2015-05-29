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

public class DualItemAdaptor extends BaseAdapter {

	private Context context;
	// private List<QuadItem> quadItemList;

	private List<DualItem> dualItemList;

	public DualItemAdaptor(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dualItemList.size();
	}

	@Override
	public Object getItem(int postion) {
		// TODO Auto-generated method stub
		return dualItemList.get(postion);
	}

	@Override
	public long getItemId(int postion) {
		// TODO Auto-generated method stub
		return dualItemList.get(postion).hashCode();
	}

	public List<DualItem> getDualItemList() {
		return dualItemList;
	}

	public void setDualItemList(List<DualItem> dualItemList) {
		this.dualItemList = dualItemList;
	}

	@Override
	public View getView(int postion, View convertView, ViewGroup group) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;

		if (convertView == null) {

			LayoutInflater li = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.dual_item, group, false);
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
			holder.tv2 = (TextView) convertView.findViewById(R.id.item2);

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.tv1.setText(dualItemList.get(postion).getItem1());
		holder.tv2.setText(dualItemList.get(postion).getItem2());

		return convertView;
	}

	static class ViewHolder {
		private TextView tv1, tv2;

	}

}
