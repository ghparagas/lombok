package poseidon.lombok.example;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * val works on local variables and foreach loops only.
 */
public class Val {

    /**
     * Sample val used as local variable
     * @return
     */
    public String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    /**
     * Sample val in foreach loop
     */
    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

}
