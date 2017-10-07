package com.ust;
	
	def filterList(list){
		def filteredItems = new ArrayList<>();
		// for(item in list){
		// 	if(item.length()>5){
		// 		filteredItems.add(item);
		// 	}
		// }	
		return list.findAll{it.size() > 5};
	}
	
        def list = ["Apples", "Grapes", "Bananas", "Oranges", "Kiwi"]
		// def list = new ArrayList<>();
		// list.add("Apples");
		// list.add("Grapes");
		// list.add("Bananas");
		// list.add("Oranges");
		// list.add("Kiwi");
	
		def filteredList = filterList(list);
		println(filteredList);
		


