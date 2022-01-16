package com.eldorteshaboev.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldorteshaboev.recycleview.adapters.UserAdapter
import com.eldorteshaboev.recycleview.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<User>
    lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        userAdapter = UserAdapter(this,list)
        rv.adapter = userAdapter
    }

    private fun loadData() {
        list = ArrayList()
        for (i in 0..100) {
            list.add(User("Ronaldo $i","https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg):focal(1272x210:1274x208)/origin-imgresizer.eurosport.com/2021/10/24/3242131-66359888-2560-1440.jpg"))
            list.add(User("Benzema $i","https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Karim_Benzema_wearing_Real_Madrid_home_kit_2021-2022.jpg/800px-Karim_Benzema_wearing_Real_Madrid_home_kit_2021-2022.jpg"))
            list.add(User("Raul $i","https://img.a.transfermarkt.technology/portrait/header/7349-1570439548.jpg?lm=1"))

        }
    }
}