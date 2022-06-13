package com.ajiedwi.spannablestring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_two_color.setTextTwoColor("This text colored", "blue")
        tv_three_color.setTextThreeColor("This text colored", "blue", "and red")
        tv_two_style.setTextTwoStyle("This text should be", "a bold text")
        tv_two_style_color.setTextTwoStyleColor("This text should be", "bold and blue")
        tv_clickable.setTextClickable("Try to click on", "this"){
            Toast.makeText(this, "Clickable text success!", Toast.LENGTH_SHORT).show()
        }
    }
}