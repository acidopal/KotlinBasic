fun main(args:Array<String>){
    print("Nilai : ")
    var nilai:Double= readLine()!!.toDouble()

    if (nilai<75){
        print("Anda Harus Remedial!")
    }else{
        print("Selamat Anda Lulus!")
    }
}