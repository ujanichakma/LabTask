import java.util.Arrays;
import java.util.Scanner;

public class SmallestNum {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int[] num=new int[10];
        for(int i=0;i<10;i++){
            num[i]=input.nextInt();
        }
     //sumWithoutSmallest(num);
        int x=sumWithoutSmallest(num);
        System.out.println(x);
    }
    public static int sumWithoutSmallest(int num[]){
        //Scanner input=new Scanner(System.in);
        int sum=0;
        Arrays.sort(num);
        for(int i=0;i<10;i++){
            //num[i]=input.nextInt();
            System.out.print(num[i]+" ");
        }
        System.out.print("\n");
        int minimum=num[0];
        for(int i=1;i<10;i++){
            sum=sum+num[i];
        }
        return (sum-minimum);
    }
}
