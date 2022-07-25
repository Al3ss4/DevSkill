import java.util.ArrayList;
import java.util.*;

public class UtilityArray {

    public static List<Integer> generaArray(List<Integer> array1, List<Integer> array2){
        List<Integer> array3 = new ArrayList<>();

        array3.addAll(array1);
        array3.addAll(array2);
        return array3;
    }
}
