package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NameChangeFragment : Fragment() {
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText
    lateinit var changeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val layout = inflater.inflate(R.layout.fragment_name_change, container, false)
        displayTextView = layout.findViewById<TextView>(R.id.displayTextView)
        nameEditText = layout.findViewById<EditText>(R.id.nameEditText)
        changeButton = layout.findViewById<Button>(R.id.changeButton)
        changeButton.setOnClickListener {
            val name = nameEditText.text

            displayTextView.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }

        return layout
    }

}