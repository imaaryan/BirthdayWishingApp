package com.aaryanprojects.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view: View) {

       val name = inputNameField.editableText.toString()
       val intent = Intent(this, BirthdayCardView::class.java)
        intent.putExtra(BirthdayCardView.ENTERED_NAME, name)
       startActivity(intent)
    }



}