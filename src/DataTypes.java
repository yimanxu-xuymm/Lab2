import java.util.List;

public class DataTypes {
    // TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static int sum(List<Integer> numbers) {

        int s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
