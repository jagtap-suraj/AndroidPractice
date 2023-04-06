package com.example.buttonuse

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etVar1 = findViewById<EditText>(R.id.etVar1)
        var etVar2 = findViewById<EditText>(R.id.etVar2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnDivide = findViewById<Button>(R.id.btnDivide)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1 = etVar1.text.toString().toDouble()
            val num2 = etVar2.text.toString().toDouble()
            val sum = num1 + num2
            tvResult.text = String.format("%.2f + %.2f = %.2f", num1, num2, sum)
        }

        btnSubtract.setOnClickListener {
            val num1 = etVar1.text.toString().toDouble()
            val num2 = etVar2.text.toString().toDouble()
            val diff = num1 - num2
            tvResult.text = String.format("%.2f - %.2f = %.2f", num1, num2, diff)
        }

        btnMultiply.setOnClickListener {
            val num1 = etVar1.text.toString().toDouble()
            val num2 = etVar2.text.toString().toDouble()
            val product = num1 * num2
            tvResult.text = String.format("%.2f × %.2f = %.2f", num1, num2, product)
        }

        btnDivide.setOnClickListener {
            val num1 = etVar1.text.toString().toDouble()
            val num2 = etVar2.text.toString().toDouble()
            if (num2 != 0.0) {
                val quotient = num1 / num2
                tvResult.text = String.format("%.2f ÷ %.2f = %.2f", num1, num2, quotient)
            } else {
                tvResult.text = "Cannot divide by zero!"
            }
        }
    }
}
