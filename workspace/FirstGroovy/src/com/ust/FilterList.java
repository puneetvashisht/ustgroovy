package com.ust;

import java.util.ArrayList;
import java.util.List;

class FilterList {
	
	public List<String> filterList(List<String> list){
		List<String> filteredItems = new ArrayList<>();
		for(String item: list){
			if(item.length()>5){
				filteredItems.add(item);
			}
		}	
		return filteredItems;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apples");
		list.add("Grapes");
		list.add("Bananas");
		list.add("Oranges");
		list.add("Kiwi");
		
		//
		FilterList obj = new FilterList();
		List<String> filteredList = obj.filterList(list);
		System.out.println(filteredList);
		
	}

}