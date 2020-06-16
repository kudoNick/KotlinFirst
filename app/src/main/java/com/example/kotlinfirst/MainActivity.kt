package com.example.kotlinfirst

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.tvName
import kotlinx.android.synthetic.main.data.*
import kotlinx.android.synthetic.main.datadialog.*

class MainActivity : AppCompatActivity() {
    var dataList: ArrayList<Data> = ArrayList()
    var data: Data = Data()
    var stringList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showName("Tuan")


//        var a: Int = 10
//        var b: Int = 15
//
//        if (a > b) {
//            Log.d("AAA", "Gia tri lon nhat la : $a")
//        } else {
//            Log.d("AAA","Gia tri lon nhat la: $b")
//        }


//        var name: String = "Tuan"
//
//        when (name) {
//            "hien" -> Log.d("AAA","Chao ban hien!")
//            "Tuan" -> Log.d("AAA","Chao ban Tuan!")
//            "Hoang" -> Log.d("AAA","Chao ban Hoang!")
//        }
//
//        var a: Int = 12
//        when (a) {
//            in 1..3 ->Log.d("AAA","Quy 1")
//            in 4..6 ->Log.d("AAA","Quy 2")
//            in 7..9 ->Log.d("AAA","Quy 3")
//            in 10..12 ->Log.d("AAA","Quy 4")
//            else -> Log.d("AAA","Khong co gia tri cua bien")
//        }
//        var b: Int = 6
//        while (b <= 10) {
//            Log.d("AAA","Chao ban lan thu $b")
//            b++
//        }
//        for (i in 10 downTo 5 ) {
//            Log.d("AAA","Chao ban $i")
//        }
//        for (i in 0..10 step 2 ) {
//            Log.d("BBB","Chao ban $i")
//        }
//        Cách 1:
//        var mangSo:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
//        mangSo.get(0)
//        cách 2:
//        var mangTen: List<String> = listOf("Tuan","Thu")
//        mangTen.get(1)
//        Cách 3:
//        var mangTen: ArrayList<String> = ArrayList()
//        mangTen.add("Phat")
//        mangTen.add("Tuan")
//        mangTen.add("Thu")
////        Kiểm tra số lượng phần tử trong mảng
//        mangTen.size
////        Xóa phần tử trong mảng
////        mangTen.remove("Thu")
////        mangTen.removeAt(0)
//        Log.d("CCC",mangTen.size.toString())
////        Sửa giá trị trong mảng
//        mangTen.set(0,"Hoang")
//        Log.d("CCC",mangTen.get(0))
        //OOP



        btnSave.setOnClickListener {
            addData()
        }

        lvData.setOnItemClickListener { parent, view, position, id ->
             var builder :AlertDialog.Builder = AlertDialog.Builder(this)
            var view: View = LayoutInflater.from(this).inflate(R.layout.datadialog,null)
            var name: TextView = view.findViewById(R.id.tvNameDialog1)
            builder.setView(view)
            builder.create()
            builder.show()

        }
    }

    private fun showName(ten: String){
     tvName.setOnClickListener(View.OnClickListener {
         Toast.makeText(this,ten,Toast.LENGTH_SHORT).show()
     })
    }
    fun addData(){

        var name: String = edtName.text.toString().trim()
        stringList.add(name)
        lvData.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,stringList)

//        data.setName(edtName.text.toString().trim())
//        dataList.add(data)
//        lvData.adapter = DataAdapter(this,dataList)
    }


}