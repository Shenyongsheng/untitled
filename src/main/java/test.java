import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] mp ={20,3,9,-1,10,3,20};
        test(mp);
        System.out.println(Arrays.toString(mp));
    }
    static void test(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = 0; i1 < arr.length-1-i; i1++) {
                if(arr[i1] >= arr[i1+1]){
                    int temp =  arr[i1];
                    arr[i1] =  arr[i1+1];
                    arr[i1+1] =  temp;
                }
            }
        }

//            System.out.print(Arrays.toString(arr));
        }
    }

