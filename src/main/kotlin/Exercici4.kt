package org.example

/*4. Fent servir expressions regulars, creeu un programa que verifiqui si un NIF és correcte. No cal validar la lletra, només cal validar el format. Recordeu que el format d’un NIF son 8 dígits seguits d’una lletra.
*/

fun main () {
    val dni:String = "49831677D"

    val regex: Regex = "[\\d]{8}[A-Z]".toRegex()

    val resultat = regex.matches(dni)

    if (resultat) println("El dni es correcte")
    else println("ERROR! El dni no es correcte")
}