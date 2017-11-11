fun main(args:Array<String>){
    print("Nilai : ")
    var nilai:Double= readLine()!!.toDouble()

    if (nilai<75){
        print("Anda Harus Remedial!")
    }

    if (nilai>75){
        print("Selamat Anda lulus!")
    }
}