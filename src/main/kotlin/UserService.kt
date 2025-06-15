package example

class UserRepository {
    fun findUser(id: Int): String {
        // Pretend to call DB
        return "Real User"
    }
}

class UserService(private val userRepository: UserRepository) {
    fun getUserName(id: Int): String {
        return userRepository.findUser(id)
    }
}
