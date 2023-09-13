package com.asus.kotlinsimplecalculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.asus.kotlinsimplecalculator.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding


var number1 : Int? = null
var number2 : Int? = null
var  result : Int? = null



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        
    }


    fun getNumber(){

        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

       if (number1==null || number2==null){

           binding.textView.text = "Please enter a number!"

       }



/*
        if (binding.editTextNumber1.text.toString()==null || binding.editTextNumber2.text.toString()==null){

            binding.textView.text = "Please enter a number!"

        }else{
            number1 = binding.editTextNumber1.text.toString().toInt()
            number2 = binding.editTextNumber2.text.toString().toIntOrNull()
        }
 */


    }




    fun Summation(view: View){


         number1 = binding.editTextNumber1.text.toString().toIntOrNull()
         number2 = binding.editTextNumber2.text.toString().toIntOrNull()


        if (number1== null || number2==null){
            binding.textView.text = "Please enter a number!"

        }else{
            result = number1!! + number2!!
            binding.textView.text="Result: ${result}"

        }


    }

    fun Subraction(view: View){

        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()


        if (number1== null || number2==null){
            binding.textView.text = "Please enter a number!"

        }else{
            result = number1!! - number2!!
            binding.textView.text="Result: ${result}"

        }

    }

    fun Multiplication(view: View){

        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()


        if (number1== null || number2==null){
            binding.textView.text = "Please enter a number!"

        }else{
            result = number1!! * number2!!
            binding.textView.text="Result: ${result}"

        }

    }

    fun Divison(view: View){

        var number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        var number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()


        if (number1== null || number2==null){
            binding.textView.text = "Please enter a number!"

        }else{
            var result = number1!! / number2!!
            binding.textView.text="Result: ${result}"

        }
    }




}