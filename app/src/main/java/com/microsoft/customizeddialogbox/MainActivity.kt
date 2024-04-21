package com.microsoft.customizeddialogbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.microsoft.customizeddialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var dialog:Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog=Dialog(this)
        dialog.setContentView(R.layout.custom_dialogure)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))
        binding.button.setOnClickListener(){
          dialog.show()
        }
        var buton=dialog.findViewById<Button>(R.id.btnGood)
        var fb=dialog.findViewById<Button>(R.id.feedback)
        buton.setOnClickListener(){
            dialog.dismiss()
        }
        fb.setOnClickListener(){
            Toast.makeText(this,"feedback submited",Toast.LENGTH_SHORT).show()
        }
    }
}