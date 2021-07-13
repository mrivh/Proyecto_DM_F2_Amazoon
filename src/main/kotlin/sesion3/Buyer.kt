package sesion3

import java.text.CollationElementIterator

class Buyer(id: Int, username: String, email: String, password: String) : User(id, username, email, password) {
    init {
        println("Buyer $username has been created")
    }
    private val orders: MutableList<Order> = mutableListOf()
    private val wishlist: MutableList<Product> = mutableListOf()
    private val cart: MutableList<Product> = mutableListOf()
    private var prime: Boolean = false

    fun addOrder(order: Order){
        println("Product ${order.id} was added to you cart")
        orders.add(order)
    }

    fun addCart(product: Product){
        println("Product ${product.name} was added to you cart")
        cart.add(product)
    }

    fun addWhishlist(product: Product){
        println("Product ${product.name} was added to you wishlist")
        wishlist.add(product)
    }

    fun deleteFromCart(productId: Int){
        var item: Int = 0
        for(i in 0 until cart.size){
            if(cart[i].id == productId) item = i
        }
        println("Item ${cart[item].name} was removed from your cart")
        cart.removeAt(item)
    }

    fun deleteFromWhishlist(productId: Int){
        var item: Int = 0
        for(i in 0 until wishlist.size){
            if(wishlist[i].id == productId) item = i
        }
        println("Item ${wishlist[item].name} was removed from your wishlist")
        wishlist.removeAt(item)
    }

    fun buy(orderCtr: Int){
        for(i in 0 until cart.size){
            val order = Order(orderCtr, username, cart[i].seller, cart[i].id)
            addOrder(order)
        }
        println("All you items in your cart were purchased")
    }

    fun getOrders(): MutableList<Order>{
        return orders
    }

    fun getCart(): MutableList<Product>{
        return cart
    }

    fun getWishlist(): MutableList<Product>{
        return wishlist
    }
}