/*
Math calculator
 */
fun main(args:Array<String>){
    println("--- Math Calculator ---")
    print("Nilai 1 : ")
    var n1:Int= readLine()!!.toInt()
    print("Nilai 2 : ")
    var n2:Int= readLine()!!.toInt()
    var sum:Int?
    sum=n1+n2

    println("Sum : "+n1+" + "+n2+" = "+sum)
}