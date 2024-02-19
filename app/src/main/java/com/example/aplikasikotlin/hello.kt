package com.example.aplikasikotlin

fun main(args: Array<String>) {
    biodata("Dimas Muflih Arinal Khaq", pekerjaan = "saya bekerja sebagai freelancer dibidang editng dan design")
    hobby("Game","saya adalah mahasiswa teknologi informasi politeknik madiun saya juga bekerja sebagai freelancer dibidang editing dan design saya gemar bermain game dan pergi jalan keluar kota diwaktu luang saya")
}

fun biodata(nama: String, kelas:String = "2A", pekerjaan: String ,  ){ // minimal 2 parameter/args
    val biodata = "nama = ${nama}\nkelas = ${kelas}\npekerjaan = ${pekerjaan}\n"
    print(biodata)
}

fun hobby(hobby:String, desc:String){ // 2 parameter
    println("hobby = ${hobby}")
    println(desc)
}