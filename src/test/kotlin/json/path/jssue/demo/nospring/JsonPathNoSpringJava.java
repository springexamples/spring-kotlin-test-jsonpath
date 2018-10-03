package json.path.jssue.demo.nospring;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Option;
import net.minidev.json.JSONArray;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static com.jayway.jsonpath.JsonPath.using;

public class JsonPathNoSpringJava {

    @Test
    public void test() {

        Configuration conf = Configuration.builder().options(Option.ALWAYS_RETURN_LIST).build();

        List<String> read = using(conf)
                .parse("[{\"username\":\"ali\",\"age\":30},{\"username\":\"wael\",\"age\":40}]")
                .read("$[*].username");
        Assertions.assertThat(read).containsExactlyInAnyOrder("invalid", "will", "fails");
    }
}
