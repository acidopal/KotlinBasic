fun main(args:Array<String>){
    print("Nilai : ")
    var nilai:Int= readLine()!!.toInt()

    if(nilai>75) {
        if (nilai >= 90) {
            println("Selamat Anda lulus!")
            println("Nilai Anda Sangat Memuaskan!")
        }else if (nilai==80){
            println("Selamat Anda lulus!")
            println("Nilai Anda Bagus!")
        }
    }else{
        print("Anda Harus Remedial!")
    }
}