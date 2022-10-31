package ar.edu.ort.challenge6

/*Object --> es 1 singleton
    --> unica instancia y generalmente tiene acceso global.
    Se usa object para poder acceder a este elemento desde settings(perfil).
    Lo definimos como nulleable x eso se agrega el ?
* */
object UserSession {
    var userName: String? = null
}