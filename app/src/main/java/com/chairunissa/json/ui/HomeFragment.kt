package com.chairunissa.json.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.chairunissa.json.R
import com.chairunissa.json.adapter.MainAdapter
import com.chairunissa.json.data.model.GetAllCarResponseItem
import com.chairunissa.json.data.network.CarsApi
import com.chairunissa.json.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val carList = listOf(
//            GetAllCarResponseItem(
//                "","","",0,"","Xenia",25000,"",true,""
//            ),GetAllCarResponseItem(
//                "","","",0,"","Xenia",25000,"",true,""
//            ),GetAllCarResponseItem(
//                "","","",0,"","Xenia",25000,"",true,""
//            )
//        )
//
//        binding.rvMain
//        val adapter = MainAdapter(carList)
//        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
//        binding.rvMain.layoutManager = layoutManager
//        binding.rvMain.adapter = adapter

        CarsApi.retrofitService.allCar().enqueue(object : Callback<List<GetAllCarResponseItem>> {
            override fun onResponse(
                call: Call<List<GetAllCarResponseItem>>,
                response: Response<List<GetAllCarResponseItem>>
            ) {
                val body = response.body()
                val code = response.code()
                if (code==200) {
//                    if(body != null){
//                        for(i in 0 until body.count()){
//                            val id = body[i].id.toString()
//                            val name = body[i].name
//                            val price = body[i].price.toString()
//
//                            Log.d("ID", id)
//                            Log.d("Name", name)
//                            Log.d("Price", price)
                            showList(body)
                        }
//                    } else {
//                        Log.d("TAG", "Fail fetch body")
//                    }
//                }
            }

            override fun onFailure(call: Call<List<GetAllCarResponseItem>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    private fun showList(data:List<GetAllCarResponseItem>?){
        val adapter = MainAdapter(data!!)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvMain.layoutManager = layoutManager
        binding.rvMain.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

}