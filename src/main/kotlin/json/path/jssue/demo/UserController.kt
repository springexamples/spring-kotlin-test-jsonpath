package json.path.jssue.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class User(val username: String, val age: Int)

@RestController
@RequestMapping("/")
class UserController() {

    @GetMapping("/users")
    fun listUsers() = ResponseEntity.ok(listOf(User("ali", 30), User("wael", 40)))
}
