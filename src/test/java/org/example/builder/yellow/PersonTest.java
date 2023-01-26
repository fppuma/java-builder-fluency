package org.example.builder.yellow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void test() {
        Person john = new Person.Builder()
                .name("John Smith")
                .age(35)
                .build();

        assertEquals(john.getName(),"John Smith");
        assertEquals(john.getAge(), 35);
    }
}
