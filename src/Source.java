import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr =new int[]{4,1,1,1,4};
        System.out.println(grow(arr)==16);
    }
    public static int grow(int[] x){
        return Arrays.stream(x).reduce((i,j)-> i*j).getAsInt();
    }
}
