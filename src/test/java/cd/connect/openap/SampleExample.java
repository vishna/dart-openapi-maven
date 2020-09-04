package cd.connect.openap;

import org.junit.Test;
import org.openapitools.codegen.OpenAPIGenerator;

import java.util.Arrays;

public class SampleExample {
  @Test
  public void runGenerator() {
    String location = getClass().getResource("/test.yaml").getFile();
    OpenAPIGenerator.main(Arrays.asList("generate",
      "--input-spec", location,
      "--generator-name", "dart2-api",
      "--output", "target/" + getClass().getSimpleName())
      .toArray(new String[0]));
  }
}
