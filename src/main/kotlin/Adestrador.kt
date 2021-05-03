class Adestrador : Seleccion {

    var idFederacion:String="0a"

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: Int) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion.toString()
    }
    fun dirixirPartido():Unit{
        println("Dirixe")
    }
    fun dirixirAdestramento():Unit{
        println("Dirixe Adestramento")
    }
    override fun concentrarse(tiempoConcentracion: Int): String {
        return "A selección concéntrase durante $tiempoConcentracion minutos"
    }
    override fun viaxar(pais: String): String {
        return  "Viaxan os xogadores a $pais"
    }
    override fun toString(): String {
        return super.toString()+", idFederacion='$idFederacion'"
    }
}