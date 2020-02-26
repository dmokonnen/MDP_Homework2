package edu.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var list=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.addAll(arrayOf("Hamburger", "Pizza","Mexican", "American", "Chinese"))
    }

    fun clickAdd(view: View) {
        list.add(newFood.text.toString())
    }
    fun clickDecide(view: View) {
        val rd:Int = (0 until list.size).random()
        dinner.text= list[rd]
    }

}
