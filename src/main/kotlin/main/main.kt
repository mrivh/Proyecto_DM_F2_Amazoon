package main

import sesion1_2_3.Login
import sesion1_2_3.Market
import sesion1_2_3.Whishlist
import sesion5_6.Car


fun main() {
    /*var userCntr = 0
    var productCntr = 0
    val buyer1 = Buyer(userCntr,"Alfredo", "alfredo@gmail.com","alf123")
    userCntr++
    val seller1 = Buyer(userCntr,"Seller1", "seller1@gmail.com","sel123")
    userCntr++
    val amazoon = Amazoon()
    amazoon.registerBuyer(buyer1)*/

    val log = Login(user = String(), pass = String(), us = String(), pas = String())
    val market = Market(
        nameproduct = String(), typeproduct = String(), brand = String(), color = String(),
        manyproducts = String(), description = String())
    val whishlist = Whishlist()
    val car = Car(product = String(), precio = Int.MAX_VALUE , cantidad = Int.MAX_VALUE, id_compra = Int.MAX_VALUE)

    println("[         Amazoon          ]")

    println("--------- Login ------------")
    println("Crea un usuario")
    log.user = readLine().toString()
    println("Crea un password")
    log.pass = readLine().toString()
    println("Ingresa tu usuario")
    log.us = readLine().toString()
    println("Ingresa tu password ")
    log.pas = readLine().toString()

    if (log.user == log.us && log.pass == log.pas) {
        println("Hola ${log.user} ¡Bienvenido a tu súper cuenta de Amazoon :D !")
    } else {
        println("Error al encontrar al usuario!!")
    }

    println("Ingresa '1' si quieres ingresar productos que quieras vender.")
    println("Ingresa '2' si quieres visualizar los productos de la tienda y poder comprar.")
    val option: Int = readLine()!!.toInt()

    var options = when (option) {
        1 -> if (log.user == log.us && log.pass == log.pas) {
            println("---------Ingreso de productos------------")

            println("Ingresa el nombre de tu producto")
            market.nameproduct = readLine().toString()

            println("Ingresa la categoria de tu producto")
            market.typeproduct = readLine().toString()

            println("Ingresa la marca de tu producto")
            market.brand = readLine().toString()

            println("Ingresa el color de tu producto")
            market.color = readLine().toString()

            println("Ingresa la cantidad de unidadades de tu producto")
            market.manyproducts = readLine().toString()

            println("Ingresa una descripcion breve de tu producto")
            market.description = readLine().toString()

            println("producto agregado exitosamente")

            println(
                "Nombre del producto ${market.nameproduct} de la categoria ${market.typeproduct} " +
                        "de la marca ${market.brand} de color ${market.color} con la cantidad de ${market.manyproducts} ${market.description}"
            )
        } else {
            println("Acceso a tu cuenta denegado!!")
        }
        2 -> println(
            "${whishlist.printyourproducts()}" +
                    "${whishlist.printallproducts()}"
        )
        else -> println("Solo puedes seleccionar la option 1 o 2")
    }
    println("----Ingresa el numero de la categoria del tipo tipo de productos a comprar----- ")
    println(" '1' Ropa")
    println(" '2' Joyeria")
    println(" '3' Juguetes")
    println(" '4' Electronica")
    println(" '5' Cosas del hogar")
    println(" '6' Electrodomesticos")
    val option2: Int = readLine()!!.toInt()
    var options2 = when (option2) {
        1 -> println("${car.cate1()} ")
        2 -> println("${car.cate2()} ")
        3 -> println("${car.cate3()} ")
        4 -> println("${car.cate4()}")
        5 -> println("${car.cate5()} ")
        6 -> println("${car.cate6()}")
        else ->
            println("Solo puedes ingresar de la opción 1 a la 6 ")
    }

}


