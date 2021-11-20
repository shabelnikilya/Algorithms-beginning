package algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EuclidTest {

    @Test
    public void maxCommonDivisiorFirst16Second20() {
        Euclid euclid = new Euclid();
        int first = 16;
        int second = 20;
        assertThat(euclid.maxCommonDivisior(first, second), is(4));
    }

    @Test
    public void maxCommonDivisiorFirst48Second40() {
        Euclid euclid = new Euclid();
        int first = 48;
        int second = 40;
        assertThat(euclid.maxCommonDivisior(first, second), is(8));
    }

    @Test
    public void maxCommonDivisiorFirst17Second21() {
        Euclid euclid = new Euclid();
        int first = 17;
        int second = 21;
        assertThat(euclid.maxCommonDivisior(first, second), is(1));
    }
}