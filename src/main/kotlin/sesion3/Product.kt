package sesion3

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Float,
    val discount: Float,
    val rating: Float,
    val seller: String
)