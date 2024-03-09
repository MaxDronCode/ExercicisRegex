package org.example
import java.text.Normalizer

/*1. Fent servir la classe String, creeu un programa que digui si una frase introduïda és un palíndrom o no, és a dir, si es llegeix igual d'esquerra a dreta que de dreta a esquerra, sense tenir en compte els espais, accents, apòstrofs, símbols ni majúscules.
(Pista: podeu utilitzar el mètode reverse() de la classe StringBuilder).
Exemples:
• Amor a Roma
• Dábale arroz a la zorra el abad
• ¿Será lodo o dólares?
• Sara Baras
• Llepa la pell
• A dit, sorprès, a l'obert avenc nevat, rebo la serp rostida.
• Malfia't, animal, astut rival. La virtut: salami, nata i flam.
• Truca'm a casa, camacurt!
*/

fun main() {
    val textOriginal:String = "Truca'm a casa, camacurt!"
    var text:String = textOriginal.lowercase()
    text = quitarAcentos(text)
    text = quitarSignos(text)

    var regex = "[\\s]".toRegex()

    var reemplazo:String = ""

    var res1 = regex.replace(text, reemplazo)
    var res2 = res1.reversed()

    println(textOriginal)
    if (res1.compareTo(res2) == 0) println("Es un palindrom")
    else println("No es un palindrom")



}

fun quitarAcentos(texto: String): String {
    val textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
    val regex = "\\p{InCombiningDiacriticalMarks}+".toRegex()
    return regex.replace(textoNormalizado, "")
}

fun quitarSignos(texto:String) : String {
    val regex = "[?¿¡!',.;:]".toRegex()
    return regex.replace(texto, "")
}