package sesion1_2_3

class Whishlist{

    fun printyourproducts(){
        println("------Hola, bienvenido a la vista de todos los productos------")
        println("Tus productos agregados")
        println(1)
    }
    fun printallproducts(){
        println("Todos los diferentes tipos de productos, que hay en la tienda")
        var products = listOf("Ropa","Joyeria","Juguetes","Electronica","Cosas del hogar"
            ,"Electrodomesticos")
        println(products)

    }
}