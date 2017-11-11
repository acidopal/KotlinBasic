fun main(args:Array<String>){
    var n1:Int=10
    var n2:Int?
    var n2Str:String="12"
    n2=n2Str.toInt()
    var n2Float:Float?

    //konvert String to Float
    n2Float=n2Str.toFloat()
    println("n1 : "+ n1)
    println("n2 : "+ n2)
    println("n2Float : "+ n2Float)
    
    var xpi:Double=3.14
    println("xpi : "+xpi)

    //Konvert Double to Integer
    var IntPi:Int=xpi.toInt()
    print("IntPi : "+IntPi)
}
