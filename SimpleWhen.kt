fun main(args:Array<String>){
    var x=10
    when(x){
        1 -> {
            print("Value is 1")
        }
        2,3 -> {
            print("Value is 2 or 3")
        }
        in 10..30 -> {
            print("Value is 10 until 30")
        }
        !in 10..30 -> {
            print("Value is not 10 until 30")
        }
        else ->{
            print("Value is out of range")
        }

    }
}