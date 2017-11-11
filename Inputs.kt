fun main(args:Array<String>){
    //Var menampung data
    //Val nilai tetap data
    print("Enter name : ")
    var name= readLine()
    print("Enter age : ")
    val age:Int= readLine()!!.toInt()
    print("Enter Departement : ")
    var dep:String?
    dep = readLine()
    val location="Bogor"

    println("Nama : "+name)
    println("Age : "+age)
    println("Dep : "+dep)
    println("Location : "+location)
}