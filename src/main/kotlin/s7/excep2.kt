package s7
/*
*Throwable
* Exception
* all other exceptions that are predefined
 * */

fun main() {

    //Intentar realizar una compra, sin cumplir el rango de edad
    class IllegalBuyerException(message: String) : Exception(message)

    fun buy(name: String, age: Int) {
        if (age < 15)
            throw IllegalBuyerException("Menores de 15 años no pueden realizar compras")
        println("$name buyer")
    }

    try {
        buy("Paola", 13)
    } catch (e: IllegalBuyerException) {
        e.printStackTrace()
    } finally {
        println("proceso finalizado")
    }

    //Intentar comprar 6 productos
    class Product() {
        var available = true

        fun bought() {
            if (available) {
                available = false
                println("Compra efectuada")
            }
        }

        fun notbought() {
            available = true
            println("Compra cancelada")
        }
    }

    val stock = listOf(Product(), Product(), Product(), Product())

    try {

        val productsToBuy = 6
        val end = productsToBuy - 1

        for (i in 0..end) {
            stock[i].bought()
        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("No hay suficientes productos en stock, por favor disminuye la cantidad")

        stock.forEach {
            it.notbought()
        }
    } finally {
        println("Gracias por tu preferencia")
    }

    //Falta un dato
    val names: List<String?> = listOf("Name One", null, "Name Three")

    // Por Condiciones
    names.forEach {
        if (it != null) {
            println(it)
        }
    }

    // Por safe call
    names.forEach { it?.let { println(it) } }


    //imprimir las casillas nulas

    names.forEach {
        val printString = it ?: "No se encontró nombre en este campo"
        println(printString)
    }


    val person = Person("Geraldine", "geraldine.mtts@gmail.com")
    println(person.getEmail())
    println(person.getFullData())

    val person2 = Person("Randy")
    println(person2.getEmail())
    println(person2.getFullData())
}

class Person(
    private val name:String,
    private val email:String? = null){

    fun getFullData(): String {
        val lEmail =  email ?: throw IllegalArgumentException("Necesitas indicar tu email")
        return "$name $lEmail"
    }

    fun getEmail() : String {
        val lEmail = email ?: return "No se encontró email"
        return lEmail
    }

}