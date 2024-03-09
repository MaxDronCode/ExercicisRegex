package org.example
/*2. Fent servir la classe String, creeu un programa que compti el nombre d'aparicions d'un caràcter a una frase.
(Pista: amb expressions regulars i el mètode replace de la classe String podeu "transformar" l'String de tal manera que sigui directe obtenir el resultat que ens demana).
*/
fun main () {
    val frase:String = "Aixo es una onomatopeyaooo".lowercase()
    val charABuscar = 'o'
    val caractersASubstituir:Regex = "[^$charABuscar]".toRegex()

    val resultat = caractersASubstituir.replace(frase,"")
    println(resultat.length)
}