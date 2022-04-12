package com.chairunissa.json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chairunissa.json.data.model.GetAllCarResponseItem
import com.chairunissa.json.data.network.CarsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        CarsApi.retrofitService.allCar().enqueue(object : Callback<List<GetAllCarResponseItem>> {
//            override fun onResponse(
//                call: Call<List<GetAllCarResponseItem>>,
//                response: Response<List<GetAllCarResponseItem>>
//            ) {
//                val body = response.body()
//                val code = response.code()
//                if (code==200) {
//                    if(body != null){
//                        for(i in 0 until body.count()){
//                            val id = body[i].id.toString()
//                            val name = body[i].name
//                            val price = body[i].price.toString()
//
//                            Log.d("ID", id)
//                            Log.d("Name", name)
//                            Log.d("Price", price)
//                        }
//                    } else {
//                        Log.d("TAG", "Fail fetch body")
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<List<GetAllCarResponseItem>>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//        })

    }
}

//nampilin nama dan harga
//pake recycler view terus muncul detail
//