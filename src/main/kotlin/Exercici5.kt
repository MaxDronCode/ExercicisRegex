package org.example

/*5. Feu un programa en què, dins un text, trobi totes les paraules que contenen un subconjunt dels diftongs creixents en català. Concretament, aquells amb un so i/u en posició inicial de mot, seguits d’una vocal. El programa ha de mostrar per pantalla la paraula sencera que el conté. Per exemple, a partir del text següent:

Hola! Com anem? Cauen moltes coses, com ara iodes i iogurts, a més d'una hiena i moltes joies - va dir l’uixer.

El programa mostraria el següent:
iodes
iogurts
hiena
uixer
*/

fun main () {
    val text:String = "Hola! Com anem? Cauen moltes coses, com ara iodes i iogurts, a més d'una hiena i moltes joies - va dir l’uixer.".lowercase()

    val regex:Regex = "\\bh?[iu][aeiou][\\w]+".toRegex()

    regex.findAll(text).forEach { coincidencia -> println(coincidencia.value) }
}