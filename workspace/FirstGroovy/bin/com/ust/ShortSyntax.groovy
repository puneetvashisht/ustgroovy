	def filterList(list){
		return list.findAll{it.size() > 5};
	}
    def list = ["Apples", "Grapes", "Bananas", "Oranges", "Kiwi"]
	def filteredList = filterList(list);
	println(filteredList);