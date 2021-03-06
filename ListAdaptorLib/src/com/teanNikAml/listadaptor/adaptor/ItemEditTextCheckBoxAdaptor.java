package com.teanNikAml.listadaptor.adaptor;

import java.util.List;

import com.teanNikAml.listadaptor.activity.R;
import com.teanNikAml.listadaptor.model.ItemEditTextCheckbox;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class ItemEditTextCheckBoxAdaptor extends BaseAdapter {

	private LayoutInflater inflater;

	

	private Context context;

	private List<ItemEditTextCheckbox> itemList;

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

	public ItemEditTextCheckBoxAdaptor(Context context,
			List<ItemEditTextCheckbox> itemList) {

		inflater = LayoutInflater.from(context);
		
		this.context = context;

		this.itemList = itemList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return itemList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return itemList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return itemList.get(position).hashCode();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Questionnaire to display
		// questionnaire = questionnaireList.get(position);
		ViewHolder holder = null;

		// if (questionnaire.isChecked())

		if (convertView == null) {

			convertView = inflater.inflate(
					R.layout.item_edittext_textview_checkbox, parent, false);
			convertView.setBackgroundColor(Color.parseColor(backgroundColor));
			holder = new ViewHolder();

			holder.textView = (TextView) convertView
					.findViewById(R.id.textView_item);
			holder.checkBox = (CheckBox) convertView
					.findViewById(R.id.checkbox_item);
			holder.editText = (EditText) convertView
					.findViewById(R.id.editText_item);

			holder.textView.setTextColor(Color.parseColor(textColor));
			holder.editText.setTextColor(Color.parseColor(textColor));

			convertView.setTag(holder);

		} else {

			holder = (ViewHolder) convertView.getTag();
		}

		holder.checkBox.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				CheckBox cb = (CheckBox) v;

				ItemEditTextCheckbox itemEditTextCheckbox = (ItemEditTextCheckbox) cb
						.getTag();

				itemEditTextCheckbox.setCheckboxItem(cb.isChecked());

				notifyDataSetInvalidated();

			}
		});

		ItemEditTextCheckbox itemEditTextCheckbox = itemList.get(position);

		if (itemEditTextCheckbox.getCheckboxItem()) {
			holder.editText.setVisibility(View.GONE);

		//	holder.textView.setLayoutParams(new LayoutParams(1000,
			//		LayoutParams.WRAP_CONTENT));

			holder.textView
					.setLayoutParams(new LayoutParams(
							(int)context.getResources()
									.getDimension(
											R.dimen.item_edittext_textview_layout_width_textview_large),
							LayoutParams.WRAP_CONTENT));

		} else {
		//	holder.textView.setLayoutParams(new LayoutParams(500,
				//	LayoutParams.WRAP_CONTENT));
			
			holder.textView
			.setLayoutParams(new LayoutParams(
					(int)context.getResources()
							.getDimension(
									R.dimen.item_edittext_textview_layout_width_textview),
					LayoutParams.WRAP_CONTENT));
			
			
			holder.editText.setVisibility(View.VISIBLE);
		}

		holder.checkBox.setTag(itemEditTextCheckbox);

		holder.checkBox.setChecked(itemEditTextCheckbox.getCheckboxItem());
		if (holder.textView != null)
			holder.textView.setText(itemEditTextCheckbox.getItemTextView());

		if (holder.editText != null) {

			holder.editText.setText(itemEditTextCheckbox.getItemEdittext());
			holder.editText.setHint(itemEditTextCheckbox.getHint());
		}

		return convertView;
	}

	static class ViewHolder {
		private TextView textView;
		private EditText editText;
		private CheckBox checkBox;

	}

}
