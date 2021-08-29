package com.nepplus.uicontrolpractice_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        토스트버튼이 눌리면 => 메시지가 적힌 내용을 받아와서 => 토스트를 띄우는데 사용

        toastBtn.setOnClickListener {
//            메시지가 입력된 내용을 받아오자 => 컴퓨터가 기억해둬야 => 변수를 만들어서 저장해두자.
            val inputMessage = messageEdt.text.toString()
//            토스트를 띄울 때 변수에 담긴 내용을 띄우자
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

        }







    }
}