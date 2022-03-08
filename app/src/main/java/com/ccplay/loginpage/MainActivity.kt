package com.ccplay.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ccplay.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding //lateinit 晚點給
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

    }


    fun loginclick(view: View) {//方法後為按鈕onclick設定的名字
        Toast.makeText(this, "使用者嘗試登入", Toast.LENGTH_LONG).show()//顯示bmi在小訊息匡
        //下面開始轉換第二個畫面Activity
        val intent=Intent(this,HomePage::class.java)
        startActivity(intent)
    }




}

