package com.example.lesson4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import com.example.lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding  // ActivityMainBinding это тип разметки

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
            // Log.d("MyLog2", "Result =  $resultValue")
            bindingClass.imageView2.visibility = View.VISIBLE
            when (bindingClass.edValue.text.toString()) {

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SUELDO}"

                    if (bindingClass.editTextTextPassword2.text.toString() == Constance.DIRECTOR_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView2.setImageResource(R.drawable.face_coco)
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imageView2.setImageResource(R.drawable.dula)
                    }

                }

                Constance.INGINER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.INGENER_SUELDO}"

                    if (bindingClass.editTextTextPassword2.text.toString() == Constance.INGINER_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView2.setImageResource(R.drawable.face_coc)

                    } else {
                       bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imageView2.setImageResource(R.drawable.dula)

                    }
                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DVORNIK_SUELDO}"

                    if (bindingClass.editTextTextPassword2.text.toString() == Constance.DVORNIK_PASSWORD) {
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView2.setImageResource(R.drawable.face_co)

                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imageView2.setImageResource(R.drawable.dula)
                    }
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого работника"
                    bindingClass.imageView2.setImageResource(R.drawable.dula)
                }

            }
        }
    }


}