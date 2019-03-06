package edu.iis.mto.lab_0;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

public class TailsTest {

    private static final String HELLO = "Hello";
    private static final Object FOURTH_ELEM_VALUE = "LO";
    private static final int FOURTH_ELEM_INDEX = 3;
    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @Before
    public void setup() {
        tailsGenerator = new TailsGenerator();
        tails = tailsGenerator.tails(HELLO);
    }

    @Test
    public void tailsShouldReturnEmptyListIfParameterIsNull() {
        tails = tailsGenerator.tails(null);
        assertThat(tails, empty());
    }

    @Test
    public void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {
        assertThat(tails, Matchers.hasSize(HELLO.length() + 1));
    }

    @Test
    public void tailsShouldReturnFullStringAsFirstElement() {

        assertThat(tails.get(0), Matchers.equalTo(HELLO));
    }

    @Test
    public void tailsShouldReturn_LO_AsFourthString() {
        assertThat(tails.get(FOURTH_ELEM_INDEX), Matchers.equalTo(FOURTH_ELEM_VALUE));
    }

    @Test
    public void tailsShouldReturnEmptyStringAsLastElement() {
        assertThat(tails.get(tails.size() - 1), Matchers.equalTo(""));
    }

}
