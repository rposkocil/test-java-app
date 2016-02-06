package cz.uhk.fim.rposkocil.testjavaapp.java17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DiamondOperator Class
 * - java 1.7
 */
public class DiamondOperator {

    private List<String> letters = new ArrayList<>();
    private Set<Integer> numbers;

    public DiamondOperator() {
        this.numbers = new HashSet<>();
    }

    public List<String> getLetters() {
        return letters;
    }

    public void setLetters(List<String> letters) {
        this.letters = letters;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }
}
