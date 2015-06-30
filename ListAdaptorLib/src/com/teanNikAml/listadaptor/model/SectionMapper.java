/**
 * @author Nikhil V
 *
 * Jun 12, 2015
 */
package com.teanNikAml.listadaptor.model;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.widget.BaseAdapter;

import com.teanNikAml.listadaptor.adaptor.SectionAdaptor;

/**
 * @author Nikhil V
 *
 */
public class SectionMapper {

	private Context context;

	private String backGroundColor = "#FFFFFF", textColor = "#000000";
	
	private String backgroundColorHeading = "#FFFFFF",textColorHeading = "#000000"; 

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

	public SectionMapper(Context context) {
		super();
		this.context = context;
	}
	
	public String getBackgroundColorHeading() {
		return backgroundColorHeading;
	}

	public void setBackgroundColorHeading(String backgroundColorHeading) {
		this.backgroundColorHeading = backgroundColorHeading;
	}

	public String getTextColorHeading() {
		return textColorHeading;
	}

	public void setTextColorHeading(String textColorHeading) {
		this.textColorHeading = textColorHeading;
	}

	public BaseAdapter getAdapter(List<Object> ItemList) {

	

		SectionAdaptor adaptor = new SectionAdaptor(context);			

			adaptor.setItemList(ItemList);
			adaptor.setBackGroundColor(Color.parseColor(backGroundColor));
			adaptor.setTextColor(Color.parseColor(textColor));
			adaptor.setBackgroundColorHeading(Color.parseColor(backgroundColorHeading));
			adaptor.setTextColorHeading(Color.parseColor(textColorHeading));

			return adaptor;
		

		

		
	}



}
