package json.path.jssue.demo.nospring

import com.jayway.jsonpath.Configuration
import com.jayway.jsonpath.JsonPath.using
import com.jayway.jsonpath.Option
import org.assertj.core.api.Assertions
import org.junit.Test

class JsonPathNoSpring {

    @Test
    fun test() {

        val conf = Configuration.builder().options(Option.ALWAYS_RETURN_LIST).build()

        val read = using(conf)
                .parse("""[{"username":"ali","age":30},{"username":"wael","age":40}]""")
                .read("\$[*].username", List::class.java)

        Assertions.assertThat(read).containsExactlyInAnyOrder("invalid", "always", "fails")
    }
}
