package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps", "hooks"},
        tags = "@SortingItemsByPriceLowToHigh"
        //tags = "~@ignore"  все тесты, кроме отмеченных этим тегом
)
public class RunnerTest {

}
