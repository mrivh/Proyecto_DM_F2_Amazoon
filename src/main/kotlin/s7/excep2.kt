package s7

/*
*Throwable
* Exception
* all other exceptions that are predefined
 * */

class IllegalBuyerException(message: String) : Exception(message)

fun buy(name: String, age: Int){
    if(age < 15)
        throw IllegalBuyerException("Menores de 15 años no pueden realizar compras")
    println("$name buyer")
}

class Product(){
    var available = true

    fun bought(){
        if(available){
            available = false
            println("Compra efectuada")
        }
    }

    fun notbought(){
        available = true
        println("Compra cancelada")
    }
}
val stock = listOf(Product(), Product(), Product(), Product())


fun main () {
//Intentar realizar una compra, sin cumplir el rango de edad
    try {
     buy("Paola", 13)
}
    catch(e:IllegalBuyerException){
        e.printStackTrace()
    }
    finally {
        println("proceso terminado")
    }

//Intentar comprar 6 productos
    try{

    val productsToBuy = 6
    val end = productsToBuy -1

    for(i in 0..end ){
        stock[i].bought()
    }
}
    catch (e:ArrayIndexOutOfBoundsException) {
        println("No hay suficientes productos en stock, por favor disminuye la cantidad")

        stock.forEach {
            it.notbought()
        }
    }

    finally {
        println("Gracias por tu preferencia")
    }

//Intentar registrarse sin poner sus datos completos



}