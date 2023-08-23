package poseidon.lombok.example;

import lombok.NonNull;

public class NonNullAnnotation {

    private String name;

    public NonNullAnnotation(@NonNull String name) {
        super();
        this.name = name;
    }

}
