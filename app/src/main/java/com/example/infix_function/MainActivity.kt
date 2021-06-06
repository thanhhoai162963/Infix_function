package com.example.infix_function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum: Int = 10 cong 2
        var tru = 10 tru 2
        val cat = Animal("meo",12.2)
        cat eat ("melem melm")
        cat.extensionFunction()
    }

    private infix fun Int.cong(b: Int): Int = this + b
    private infix fun Int.tru(b: Int): Int = this - b
    private infix fun Int.nhan(b: Int): Int = this * b
    private infix fun Int.chia(c: Int): Int = this / c

    private fun Animal.extensionFunction(): Double? {
        return this.weight?.plus(2)
    }

    private infix fun Animal.eat(action: String): String {
        return action
    }
}