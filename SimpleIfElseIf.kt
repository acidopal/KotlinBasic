fun main(args:Array<String>){
    print("Nilai : ")
    var nilai:Int= readLine()!!.toInt()

    if (nilai<75){
        print("Anda Harus Remedial!")
    }else if(nilai == 75){
        println("Selamat Anda Lulus!")
        print("Nilai anda pas dengan KKM!")
    }else{
        print("Selamat Anda Lulus!")
    }
}