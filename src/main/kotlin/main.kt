fun main(args: Array<String>) {

    val xogador = Xogador(1, "Pedro", "Lópes", 20, 4, "central")
    val adestrador = Adestrador(1, "Noé", "Carballo", 42, 2545)
    val segundoxogador : Seleccion = Xogador(2, "Julia", "Vázquez", 20, 2, "Medio Centro")

    println(xogador)
    println(segundoxogador)
    println(adestrador)
    xogador.xogarPartido()
    adestrador.dirixirAdestramento()
}