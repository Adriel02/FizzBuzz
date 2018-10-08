package es.ulpgc.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();

    }

    @Test
    public void given_1_should_return_1() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    public void given_2_should_return_2() {
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void given_3_should_return_Fizz() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }
    @Test
    public void given_5_should_return_Buzz() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
    }
    @Test
    public void given_6_should_return_Fizz() {
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }
    @Test
    public void given_15_should_return_FizzBuzz() {
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }

}
