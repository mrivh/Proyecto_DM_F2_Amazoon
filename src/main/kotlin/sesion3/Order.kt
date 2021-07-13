package sesion3

data class Order(
    val id: Int,
    val buyer: Buyer,
    val seller: Seller,
    val productId: Int
)