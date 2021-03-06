package demo;

import org.junit.jupiter.api.Test;
import org.rapidpm.frp.matcher.Case;
import org.rapidpm.frp.model.Result;

import static org.rapidpm.frp.matcher.Case.matchCase;

public class DemoCase {


  @Test
  void test001() {

    String value = "A";
    Result<String> result
        = Case.match(
            matchCase(() -> Result.failure("nothing fit")),
            matchCase(() -> value.contains("A"),
                      () -> Result.success("Got A")),
            matchCase(() -> value.contains("B"),
                      () -> Result.success("Got B"))
                    );


  }
}
