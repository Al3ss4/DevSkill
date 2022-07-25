import java.util.ArrayList;

public class UtilityArray {

    public static Integer maxInVettore(ArrayList<Integer> array){
        Integer max = array.get(0);

        for (int i = 0 ; i < array.size(); i++ ){
            Integer elementoCorrente = array.get(i);
            if( elementoCorrente >max){
                max= elementoCorrente;
            }
        }
        return max;
    }
}
