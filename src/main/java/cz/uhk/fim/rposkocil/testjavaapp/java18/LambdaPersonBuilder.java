package cz.uhk.fim.rposkocil.testjavaapp.java18;

import java.util.stream.Stream;

/**
 * Created by Radula on 6.2.2016.
 */
public class LambdaPersonBuilder {

    public static Person build(PersonSetter... personSetters) {
        final Person person = new Person();

        Stream.of(personSetters).forEach(
                s -> s.set(person)
        );

        return person;
    }
}
