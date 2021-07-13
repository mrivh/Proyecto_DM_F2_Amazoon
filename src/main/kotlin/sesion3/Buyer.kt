package sesion3

class Buyer(id: Int, username: String, email: String, password: String) : User(id, username, email, password) {
    init {
        println("Buyer $username has been created")
    }
}