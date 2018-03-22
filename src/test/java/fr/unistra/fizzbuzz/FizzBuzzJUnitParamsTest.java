package fr.unistra.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzJUnitParamsTest {

    private FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    @Parameters({"1", "2", "4", "7", "11", "13", "14"})
    public void returnsNumberForInputNotDivisibleByThreeOrFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("" + number);
    }

    @Test
    @Parameters({"0", "15", "30", "45", "60", "75", "90"})
    public void returnFizzBuzzForInputDivisibleByThreeAndFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("FizzBuzz");
    }

    @Test
    @Parameters({"3", "6", "9", "12", "18", "21", "24"})
    public void returnFizzForInputDivisibleByThreeAndNotByFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("Fizz");
    }

    @Test
    @Parameters({"5", "10", "20", "25", "35", "40", "50"})
    public void returnFizzForInputNotDivisibleByThreeButByFive(int number) {
        assertThat(fizzbuzz.convert(number)).isEqualTo("Buzz");
    }
}
