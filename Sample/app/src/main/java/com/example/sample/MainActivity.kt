package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.net.Uri
import com.example.sample.databinding.ActivityMainBinding

const val KEY_1 = "Name"

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnDemo?.setOnClickListener{
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra(KEY_1, "Suraj")
            startActivity(i)
        }

        binding?.btnEmail?.setOnClickListener{
            val email = binding?.etEmail?.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$email")
            startActivity(i)
        }

        binding?.btnBrowse?.setOnClickListener{
            val address = binding?.etEmail?.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
            startActivity(i)
        }

        binding?.btnDial?.setOnClickListener{
            val phoneNo = binding?.etEmail?.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$phoneNo")
            startActivity(i)
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
