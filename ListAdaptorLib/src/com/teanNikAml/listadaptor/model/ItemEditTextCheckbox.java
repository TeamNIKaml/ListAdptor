package com.teanNikAml.listadaptor.model;

public class ItemEditTextCheckbox {
	
	private String itemEdittext,itemTextView,hint="Comments";
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	private Boolean checkboxItem;
	
	
	public String getItemEdittext() {
		return itemEdittext;
	}
	public void setItemEdittext(String itemEdittext) {
		this.itemEdittext = itemEdittext;
	}
	public String getItemTextView() {
		return itemTextView;
	}
	public void setItemTextView(String itemTextView) {
		this.itemTextView = itemTextView;
	}
	public Boolean getCheckboxItem() {
		return checkboxItem;
	}
	public void setCheckboxItem(Boolean checkboxItem) {
		this.checkboxItem = checkboxItem;
	}

}
