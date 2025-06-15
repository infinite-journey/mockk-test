package example

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UserServiceTest {

    private val userRepository = mockk<UserRepository>()
    private val userService = UserService(userRepository)

    @Test
    fun `test getUserName`() {
        every { userRepository.findUser(1) } returns "지원"

        val result = userService.getUserName(1)

        assertEquals("지원", result)
        verify { userRepository.findUser(1) }
    }
}
