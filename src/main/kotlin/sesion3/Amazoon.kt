package sesion3

class Amazoon {
    private var market: MutableList<Product> = mutableListOf()
    private var buyers: MutableList<Buyer> = mutableListOf()
    private var sellers: MutableList<Seller> = mutableListOf()
    private var orders: MutableList<Order> = mutableListOf()

    fun registerBuyer(user: Buyer){
        println("Function registerBuyer entered")
        println("Buyer ${user.username} was registered")
        buyers.add(user)
    }

    fun registerSeller(user: Seller){
        println("Function registerSeller entered")
        println("Seller ${user.username} was registered")
        sellers.add(user)
    }
}