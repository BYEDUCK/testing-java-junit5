package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("123123123");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", owner.getFirstName()),
                        () -> assertEquals("Buck", owner.getLastName()),
                        () -> assertEquals((Long) 1L, owner.getId())
                ),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity()),
                        () -> assertEquals("123123123", owner.getTelephone())
                )
        );
    }
}