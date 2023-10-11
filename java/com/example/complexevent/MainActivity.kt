package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var checkBox: CheckBox
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        checkBox = findViewById(R.id.checkBox)
        editText = findViewById(R.id.editTextText)
        textView = findViewById(R.id.textView)
        progressBar = findViewById(R.id.progressBar2)

        button.setOnClickListener() { view: View ->
            if (checkBox.isChecked && editText.text.toString() != "") {
                textView.text = editText.text

                progressBar.setProgress(progressBar.progress + 10)
            }
        }
    }
}