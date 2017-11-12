fun main(args:Array<String>){
    var n1=10
    var n2=20
    var n3=30
    var max=if (n1>n2) n1 else n2
    print("max : $max")
    /* ---- Cara #1
        var max:Int?
        if (n1>n2){
            max=n1
            print("max : "+n1)
        }else{
            max=n2
            print("max : "+n2)
        }
    */

    //WHen
    var age=30
    var isYoung=when(age){
        30->true
        else->false
    }
    println("isYoung : $isYoung")
}