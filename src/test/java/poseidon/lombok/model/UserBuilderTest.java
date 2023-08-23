package poseidon.lombok.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserBuilderTest {

    @Test
    public void testBuilder() {
        User user = User.builder()
                .firstName("John")
                .lastName("Doe")
                .build();

        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
    }

}