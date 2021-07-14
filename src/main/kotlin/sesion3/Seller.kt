package sesion3

class Seller(id: Int, username: String, email: String, password: String) : User(id, username, email, password) {
    init {
        println("Seller $username has been created")
    }
}