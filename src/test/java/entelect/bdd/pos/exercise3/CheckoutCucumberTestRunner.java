package entelect.bdd.pos.exercise3;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:entelect/bdd/pos/exercise3/checkout.feature")
public class CheckoutCucumberTestRunner {
}
