package com.tricam.ai

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnS = findViewById<TextView>(R.id.btnModeS)
        val btnG = findViewById<TextView>(R.id.btnModeG)
        val btnApple = findViewById<TextView>(R.id.btnModeApple)

        btnS.setOnClickListener {
            Toast.makeText(this, "تم تفعيل نمط Samsung One UI", Toast.LENGTH_SHORT).show()
        }

        btnG.setOnClickListener {
            Toast.makeText(this, "تم تفعيل نمط Google Pixel HDR+", Toast.LENGTH_SHORT).show()
        }

        btnApple.setOnClickListener {
            Toast.makeText(this, "تم تفعيل نمط iPhone Smart HDR", Toast.LENGTH_SHORT).show()
        }
    }
}
