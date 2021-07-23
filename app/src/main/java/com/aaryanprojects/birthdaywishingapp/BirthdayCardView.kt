package com.aaryanprojects.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_card_view.*

class BirthdayCardView : AppCompatActivity() {

    companion object {

        const val ENTERED_NAME = "entered_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card_view)

        val name = intent.getStringExtra(ENTERED_NAME)
        HappyBirthdayText.text = "Happy Birthday\n $name! "
    }
}