package com.gmail.olaleyetobi3.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
            it.visibility = GONE

        }
    }

    override fun onBackPressed() {
        this.recreate() // back button to refresh the activity

        /* overridePendingTransition(0,0)
         finish()
         overridePendingTransition(0,0)
         startActivity(this.intent)
         overridePendingTransition(0,0)*/

    }



    private fun addNickname(view:View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = GONE
        nicknameTextView.visibility = VISIBLE

        //Hide the keyboard
        val inn = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inn.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
