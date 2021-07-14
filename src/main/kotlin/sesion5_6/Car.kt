package sesion5_6

class Car(product:String, cantidad:Int, id_compra:Int, precio:Int) {

    var product: String = product
    var cantidad: Int = cantidad
    var precio: Int = precio
    var id_compra: Int = id_compra

    fun cate1() {
        println("Bienvenido a la categoria de [Ropa]")
        var categoria1 = listOf("Tenis", "Blusa", "Playeras", "Camisa")
        for (myString in categoria1) {
            println("Tu has comprado este producto ${myString}")
        }
        println("con el precio total de 500 pesos")
        println("Por tu compra has recibido una Promoción del 2% de descuento")
        var result = (500 * 2) / 100
        result = 500-result
        println("Tu pago contando el descuento es $result")
        println("Gracias por tu compra :D ")
        println("Quieres regresar al menu teclea '1' ")
        println("Quieres cerrar tu cuenta teclea '2' ")
        var regre =readLine()!!.toInt()
        if (regre==1)
            return main.main()
        else{
            println("Cuenta cerrada, Hasta luego vuelva pronto :D")
        }
    }

    fun cate2() {
        println("Bienvenido a la categoria de [Joyeria]")
        var categoria2 = listOf("Aretes", "Collar", "Pulsera", "Cadena")
        for (myString2 in categoria2) {
            println("Tu has comprado este producto ${myString2}")
        }
        println("con el precio total de $3,500 pesos")
        println("Por tu compra has recibido una Promoción del 7% de descuento")
        var result = (3500 * 7) / 100
        result = 3500-result
        println("Tu pago contando el descuento es $result")
        println("Gracias por tu compra :D ")
        println("Quieres regresar al menu teclea '1' ")
        println("Quieres cerrar tu cuenta teclea '2' ")
        var regre =readLine()!!.toInt()
        if (regre==1)
            return main.main()
        else{
            println("Cuenta cerrada, Hasta luego vuelva pronto :D")
        }
    }

    fun cate3() {
        println("Bienvenido a la categoria de [Juguetes]")
        var categoria3 = listOf("Muñeca", "Carro control remoto", "Juego de mesa", "Peluche")
        for (myString3 in categoria3) {
            println("Tu has comprado este producto ${myString3}")
        }
        println("con el precio total de $1,000 pesos")
        println("Por tu compra has recibido una Promoción del 5% de descuento")
        var result = (1000 * 5) / 100
        result = 1000-result
        println("Tu pago contando el descuento es $result")
        println("Gracias por tu compra :D ")
        println("Quieres regresar al menu teclea '1' ")
        println("Quieres cerrar tu cuenta teclea '2' ")
        var regre =readLine()!!.toInt()
        if (regre==1)
            return main.main()
        else{
            println("Cuenta cerrada, Hasta luego vuelva pronto :D")
        }
    }

    fun cate4() {
        println("Bienvenido a la categoria de [Electronica]")
        var categoria4 = listOf("Celular", "Smartwatch", "Audifonos")
        for (myString4 in categoria4) {
            println("Tu has comprado este producto ${myString4}")

        }
        println("con el precio total de $15,000 pesos")
        println("Por tu compra has recibido una Promoción del 15% de descuento")
        var result = (15000 * 15) / 100
        result = 15000-result
        println("Tu pago contando el descuento es $result")
        println("Gracias por tu compra :D ")
        println("Quieres regresar al menu teclea '1' ")
        println("Quieres cerrar tu cuenta teclea '2' ")
        var regre =readLine()!!.toInt()
        if (regre==1)
            return main.main()
        else{
            println("Cuenta cerrada, Hasta luego vuelva pronto :D")
        }
    }

    fun cate5() {
        println("Bienvenido a la categoria de [Cosas del hogar]")
        var categoria5 = listOf("Olla", "Sarten", "Platos", "Cubiertos")
        for (myString5 in categoria5) {
            println("Tu has comprado este producto ${myString5}")
        }
        println("con el precio total de $600 pesos")
        println("Por tu compra haz resibido una Promoción del 3% de descuento")
        var result = (600 * 3) / 100
        result = 600-result
        println("Tu pago contando el descuento es $result")
        println("Gracias por tu compra :D ")
        println("Quieres regresar al menu teclea '1' ")
        println("Quieres cerrar tu cuenta teclea '2' ")
        var regre =readLine()!!.toInt()
        if (regre==1)
            return main.main()
        else{
            println("Cuenta cerrada, Hasta luego vuelva pronto :D")
        }
    }

    fun cate6() {
        println("Bienvenido a la categoria de [Electrodomesticos] ")
        var categoria6 = listOf("Lavadora", "Plancha", "Licuadora", "Refrigerador")
        for (myString6 in categoria6) {
            println("Tu has comprado este producto ${myString6}")
        }
        println("con el precio total de $12,000 pesos")
        println("Por tu compra has recibido una Promoción del 10% de descuento")
        var result = (12000 * 10) / 100
        result = 12000-result
        println("Tu pago contando el descuento es $result")
        println("Gracias por tu compra :D ")
        println("Quieres regresar al menu teclea '1' ")
        println("Quieres cerrar tu cuenta teclea '2' ")
        var regre =readLine()!!.toInt()
        if (regre==1)
            return main.main()
        else{
            println("Cuenta cerrada, Hasta luego vuelva pronto :D")
        }
    }
}