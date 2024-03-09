package org.example

/*6. Fent servir expressions regulars, creeu un programa que verifiqui si una contrasenya compleix les següents condicions:
• Mínim té un dígit
• Mínim té un caràcter de puntuació (considereu 10 possibles)
• Mínim té un caràcter en majúscula
• Mida mínima de 6 caràcters
*/

fun main () {
    val contrasenya:String = "dasA1."

    val digit:Regex = "\\d".toRegex()
    val puntuacio:Regex = "[,;.:-_¡¿'?!]".toRegex()
    val majuscula:Regex = "[A-Z]".toRegex()
    val midaMinima6:Regex = "[\\S]{6,}".toRegex()
    
    println("Conte un digit: " + digit.containsMatchIn(contrasenya))
    println("Conte un caracter de puntuacio: " + puntuacio.containsMatchIn(contrasenya))
    println("Conte una majuscula: " + majuscula.containsMatchIn(contrasenya))
    println("Conte minim 6 caracters: " + midaMinima6.containsMatchIn(contrasenya))

}