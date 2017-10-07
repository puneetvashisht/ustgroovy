package com.ust.date;
import static java.util.Calendar.getInstance as now
import groovy.time.TimeCategory
import java.text.SimpleDateFormat
/*
use(TimeCategory) {
	println new Date() + 1.hour + 3.weeks - 2.days
}
*/
class TryDate{
	public static void main(String[] args){
		def input = "1998-06-03"
		def df1 = new SimpleDateFormat("yyyy-MM-dd")
		def date = df1.parse(input)
		def df2 = new SimpleDateFormat("MMM/dd/yyyy")
		println 'Date was ' + df2.format(date)
	}
}


