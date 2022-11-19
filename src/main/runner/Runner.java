package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Blast/Blast.feature"},
        glue = {"Blast"},
        tags = "@Testing",
        monochrome = true,
        plugin = {"pretty","json:target/Cucumber.json"},
        dryRun = false
)

public class runner {
}