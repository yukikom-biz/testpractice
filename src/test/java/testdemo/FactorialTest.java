package testdemo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorical fc = new Factorical();
    @Test
    public void _Input1Output1() {
        assertThat(fc.calculate(1), is(1));
    }

    @Test
    public void _Input2Output2() {
        assertThat(fc.calculate(2), is(2));
    }

    @Test
    public void _Input3Output6() {
        assertThat(fc.calculate(3), is(6));
    }

    @Test
    public void _Input4Output24() {
        assertThat(fc.calculate(4), is(24));
    }

    @Test
    public void _Input5Output120() {
        assertThat(fc.calculate(5), is(120));
    }

    @Test
    public void _Input6Output720() {
        assertThat(fc.calculate(6), is(720));
    }

    @Test
    public void _Input7Output5040() {
        assertThat(fc.calculate(7), is(5040));
    }

    @Test
    public void _Input10Output3628800() {
        assertThat(fc.calculate(10), is(3628800));
    }

    @Test
    public void _Input0OutputError() {
        assertThat(fc.calculate(0), is(-1));
    }

    @Test
    public void _InputMinus1OutputError() {
        assertThat(fc.calculate(-1), is(-1));
    }

    @Test
    public void _Input11outputError() {
        assertThat(fc.calculate(11), is(-1));
    }
}
