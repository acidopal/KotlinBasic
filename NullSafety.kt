fun main(args:Array<String>){
    var name:String?
    // ? null safety -> bisa null bisa ada nilainya
    name=null
    print(name)
    // !! harus punya nilai
    var names:String="Naufal"
    println(names!!)
}