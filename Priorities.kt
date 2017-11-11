/*
Operation rules | Priorities rules
1- ()
2- ^
3- *, /
4- +, -
5- =
 */
fun main(args:Array<String>){
    var n1:Int=10
    var n2:Int=20
    var n3:Int=5
    var sum:Int?
    // Perkalian yg pertama kali dihitung
    // n2=20 *  3 = 60
    // n1=10 + 60 = 70 -3 = 67
    sum=n1+n2*3-3
    print("Sum : $sum")
}
