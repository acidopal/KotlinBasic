import java.util.*

fun main(args:Array<String>){
     //input
     print("Enter your DOB : ")
     var DOB:Int= readLine()!!.toInt()
     //process
     var year=Calendar.getInstance().get(Calendar.YEAR)
     var age= year- DOB
     //output
     println("Your age is $age years.")
 }
