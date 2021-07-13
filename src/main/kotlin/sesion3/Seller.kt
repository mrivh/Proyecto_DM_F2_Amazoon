package sesion3

class Seller(id: Int, username: String, email: String, password: String) : User(id, username, email, password) {
    init {
        println("Seller $username has been created")
    }

    /*fun getId(): Int {
        return id
    }

    fun getUsername(): String {
        return username
    }

    fun getEmail(): String {
        return email
    }*/
}