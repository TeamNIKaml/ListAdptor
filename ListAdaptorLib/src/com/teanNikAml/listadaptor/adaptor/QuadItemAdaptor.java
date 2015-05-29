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

public class QuadItemAdaptor extends BaseAdapter {

	private Context context;
	private List<QuadItem> quadItemList;

	

	public QuadItemAdaptor(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return quadItemList.size();
	}

	@Override
	public Object getItem(int postion) {
		// TODO Auto-generated method stub
		return quadItemList.get(postion);
	}

	@Override
	public long getItemId(int postion) {
		// TODO Auto-generated method stub
		return quadItemList.get(postion).hashCode();
	}

	public List<QuadItem> getQuadItemList() {
		return quadItemList;
	}

	public void setQuadItemList(List<QuadItem> quadItemList) {
		this.quadItemList = quadItemList;
	}

	@Override
	public View getView(int postion, View convertView, ViewGroup group) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;

		if (convertView == null) {
			
			LayoutInflater li = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = li.inflate(R.layout.quad_item, group,
					false);
			holder = new ViewHolder();

			holder.tv1 = (TextView) convertView.findViewById(R.id.item1);
			holder.tv2 = (TextView) convertView.findViewById(R.id.item2);
			holder.tv3 = (TextView) convertView.findViewById(R.id.item3);
			holder.tv4 = (TextView) convertView.findViewById(R.id.item4);

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		
QuadItem quadItem = quadItemList.get(postion);
	

		holder.tv1.setText(quadItem.getItem1());
		holder.tv2.setText(quadItem.getItem2());
		holder.tv3.setText(quadItem.getItem3());
		holder.tv4.setText(quadItem.getItem4());

		return convertView;
	}

	static class ViewHolder {
		private TextView tv1, tv2, tv3, tv4;

	}

}

