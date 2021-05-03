class Xogador : Seleccion {

    var dorsal:Int=0
    var demarcacion:String="Jugador"

    /**
     * @param id numero de identificacion
     * @param nome nombre
     * @param apelido apelido
     * @param edade años
     * @param dorsal numero camiseta
     * @param demarcacion posición jugador
     */
    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }


    fun xogarPartido():Unit{
        println("JUEGA")
    }
    fun entrenar():Unit{
        println("ENTRENA")
    }

    /**
     * @param tiempoConcentracion Tiempo en minutos de la duracion de la concentración
     */
    override fun concentrarse(tiempoConcentracion: Int): String {
        return "A selección concéntrase durante $tiempoConcentracion minutos"
    }

    override fun viaxar(pais: String): String {
        return return  "Viaxan os xogadores a $pais"
    }

    override fun toString(): String {
        return super.toString()+", dorsal=$dorsal, demarcacion='$demarcacion'"
    }

}