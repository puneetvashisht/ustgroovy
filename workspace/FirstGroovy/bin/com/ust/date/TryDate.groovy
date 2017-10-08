package com.ust.date;
import static java.util.Calendar.getInstance as now
import groovy.time.TimeCategory
import java.text.SimpleDateFormat
import java.util.Date
/*
use(TimeCategory) {
	println new Date() + 1.hour + 3.weeks - 2.days
}
*/
// class TryDate{
// 	public static void main(String[] args){
// 		def input = "1998-06-03"
// 		def df1 = new SimpleDateFormat("yyyy-MM-dd")
// 		def date = df1.parse(input)
// 		def df2 = new SimpleDateFormat("MMM/dd/yyyy")
// 		println 'Date was ' + df2.format(date)
// 	}
// }

def today = new Date();
def simpleDateFormat = new SimpleDateFormat("EEE");
println simpleDateFormat.format(today).toUpperCase()
// println today.getDayOfMonth();
def df4 = new SimpleDateFormat("MM:dd:yyyy hh:mm:ss DDD")
println 'Current Date is ' + df4.format(today)


