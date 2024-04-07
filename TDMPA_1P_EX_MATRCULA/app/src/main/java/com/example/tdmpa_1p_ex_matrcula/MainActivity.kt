package com.example.tdmpa_1p_ex_matrcula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoriaElegida()
    }
    var saludList: MutableList<Int> = mutableListOf()//Mutable
    var comidaList: MutableList<Int> = mutableListOf()//Mutable
    var transporteList: MutableList<Int> = mutableListOf()//Mutable
    var serviciosList: MutableList<Int> = mutableListOf()//Mutable
    var todasCategoriasList: MutableList<Int> = mutableListOf()//Mutable

    fun categoriaElegida() {
        var rbGrupo = findViewById<RadioGroup>(R.id.rbGrupo)
        var rbSalud = findViewById<RadioButton>(R.id.rbSalud)
        var rbComida = findViewById<RadioButton>(R.id.rbComida)
        var rbTransporte = findViewById<RadioButton>(R.id.rbTransporte)
        var rbServicios = findViewById<RadioButton>(R.id.rbServicio)

        var txtSumaCatego =  findViewById<TextView>(R.id.txtSumaCatego)
        var txtPromedioCatego =  findViewById<TextView>(R.id.txtPromedioCatego)

        var txtResultado =  findViewById<TextView>(R.id.txtResultado)

        var txtListaImpresa = findViewById<TextView>(R.id.txtLista)

        var btnAdd = findViewById<Button>(R.id.btnAgregar)
        var btnTotal = findViewById<Button>(R.id.btnTotal2)
        var btnPromedio = findViewById<Button>(R.id.btnPromedio)

        var gasto = findViewById<EditText>(R.id.txtGasto)

        rbGrupo.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbSalud -> {

                        //resultado = (txtValor.text.toString().toDouble()) / 2.54
                    btnAdd.setOnClickListener {
                        saludList.add(gasto.text.toString().toInt())
                        todasCategoriasList.add(gasto.text.toString().toInt())
                        txtListaImpresa.text = imprimeSalud()
                    }
                        //txtResultado.text = imprimeSalud()

                    btnTotal.setOnClickListener {
                        var resultado = saludList.sum()
                        var total = todasCategoriasList.sum()
                        txtSumaCatego.text = resultado.toString()
                        txtResultado.text = total.toString()
                    }

                    btnPromedio.setOnClickListener {
                        var promedio = saludList.average()
                        var totalProm = todasCategoriasList.average()
                        txtPromedioCatego.text = promedio.toString()
                        txtResultado.text = totalProm.toString()
                    }

                }
                R.id.rbComida -> {

                    btnAdd.setOnClickListener {
                        comidaList.add(gasto.text.toString().toInt())
                        todasCategoriasList.add(gasto.text.toString().toInt())
                        txtListaImpresa.text = immprimeComida()
                    }
                    //txtResultado.text = immprimeComida()

                    btnTotal.setOnClickListener {
                        var resultado = comidaList.sum()
                        var total = todasCategoriasList.sum()
                        txtSumaCatego.text = resultado.toString()
                        txtResultado.text = total.toString()
                    }

                    btnPromedio.setOnClickListener {
                        var promedio = comidaList.average()
                        var totalProm = todasCategoriasList.average()
                        txtPromedioCatego.text = promedio.toString()
                        txtResultado.text = totalProm.toString()
                    }

                }
                R.id.rbTransporte -> {

                    btnAdd.setOnClickListener {
                        transporteList.add(gasto.text.toString().toInt())
                        todasCategoriasList.add(gasto.text.toString().toInt())
                        txtListaImpresa.text = imprimeTransporte()
                    }
                    //txtResultado.text = imprimeSalud()

                    btnTotal.setOnClickListener {
                        var resultado = transporteList.sum()
                        var total = todasCategoriasList.sum()
                        txtSumaCatego.text = resultado.toString()
                        txtResultado.text = total.toString()
                    }

                    btnPromedio.setOnClickListener {
                        var promedio = transporteList.average()
                        var totalProm = todasCategoriasList.average()
                        txtPromedioCatego.text = promedio.toString()
                        txtResultado.text = totalProm.toString()
                    }

                }
                R.id.rbServicio-> {

                    btnAdd.setOnClickListener {
                        serviciosList.add(gasto.text.toString().toInt())
                        todasCategoriasList.add(gasto.text.toString().toInt())
                        txtListaImpresa.text = imprimeServicios()
                    }
                    //txtResultado.text = imprimeServicios()

                    btnTotal.setOnClickListener {
                        var resultado = serviciosList.sum()
                        var total = todasCategoriasList.sum()
                        txtSumaCatego.text = resultado.toString()
                        txtResultado.text = total.toString()
                    }

                    btnPromedio.setOnClickListener {
                        var promedio = serviciosList.average()
                        var totalProm = todasCategoriasList.average()
                        txtPromedioCatego.text = promedio.toString()
                        txtResultado.text = totalProm.toString()
                    }

                }
            }
        }
    }

    fun imprimeSalud(): String {
        var cadena = ""

        for(i in 0 .. saludList.size - 1){
            cadena = cadena + ("${saludList[i]} , ")
        }
        return cadena
    }

    fun immprimeComida(): String {
        var cadena = ""

        for(i in 0 .. comidaList.size - 1){
            cadena = cadena + ("${comidaList[i]} , ")
        }
        return cadena
    }

    fun imprimeTransporte(): String {
        var cadena = ""

        for(i in 0 .. transporteList.size - 1){
            cadena = cadena + ("${transporteList[i]} , ")
        }
        return cadena
    }

    fun imprimeServicios(): String {
        var cadena = ""

        for(i in 0 .. serviciosList.size - 1){
            cadena = cadena + ("${serviciosList[i]} , ")
        }
        return cadena
    }

    fun imprimeTodasCategorias(): String {
        var cadena = ""

        for(i in 0 .. todasCategoriasList.size - 1){
            cadena = cadena + ("${todasCategoriasList[i]} , ")
        }
        return cadena
    }

}