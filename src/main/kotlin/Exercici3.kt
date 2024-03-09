package org.example

/*3. Fent servir la classe String, creeu un programa que compti el nombre de paraules a una frase. Considereu paraules seqüències de caràcters separades per un o diversos espais.
*/

fun main () {
    val text:String = "Pero bueno como  estamos   todo bien por aqui? Seguro?"

    val regex:Regex = "[\\w]+".toRegex()

    var contadorPalabras:Int = 0
    regex.findAll(text).forEach { coincidencia -> contadorPalabras++ }

    println("En esta frase hay $contadorPalabras palabras")
}