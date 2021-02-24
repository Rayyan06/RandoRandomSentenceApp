package com.example.randomsentence

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateButton: Button = findViewById(R.id.button)
        generateButton.setOnClickListener { setRandomSentence() }


    }
    private fun setRandomSentence() {
        val sentenceText: TextView = findViewById(R.id.textView)
        sentenceText.text = generateRandomSentence()
    }
}

/**
 * Generates random sentence of form
 * The Noun is transitiveVerb in the Noun
 *
 * Eg: The elephant is swimming in the pool
 */
fun generateRandomSentence(): String {
    val animalNouns = arrayOf("Elephant", "Dog", "Cat", "Cow", "Pig", "Sheep", "Eel")
    val transitiveVerbs = arrayOf("Running", "Jumping", "Diving", "Swimming", "Eating", "Dying")

    val placesNouns = arrayOf("Pool", "House", "Ocean", "Sky", "Moon", "Mars", "Basement")

    return "The ${animalNouns.random()} is ${transitiveVerbs.random()} in the ${placesNouns.random()}!"

}