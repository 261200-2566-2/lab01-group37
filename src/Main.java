import java.util.Scanner;

public class Main
{
    public static void Sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void PrintArr(int []arr){
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }

        Sort(arr);
        PrintArr(arr);
    }
}