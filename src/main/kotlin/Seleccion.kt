open abstract class Seleccion {
    var id:Int =0
    var nome:String =""
    var apelido:String =""
    var edade:Int =0

    constructor(id: Int, nome: String, apelido: String, edade: Int) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
    }

    abstract fun concentrarse(tiempoConcentracion:Int):String
    open fun viaxar(pais:String):String="A selección viaxa"

    override fun toString(): String {
        return "id=$id, nome='$nome', apelido='$apelido', edade=$edade"
    }
}