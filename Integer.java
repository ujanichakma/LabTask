import java.util.ArrayList;
import java.util.Scanner;

public class Integer {
    public static void main(String[]args){

        //ArrayList<Integer> RandomNum=new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        //RandomNum.add(0,10);
        //System.out.println(RandomNum);
       //int[] number=new int[5];
        int[] num=new int[10];
        for(int i=0;i<10;i++){
            num[i]= (int)(Math.random()*10);
            System.out.print(num[i]);
        }
        System.out.print("\n");
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.print(num[i]+" ");
            }
        }
        System.out.print("\n");
        for(int i=0;i<10;i++){
            if(num[i]%2==0){
                System.out.print(num[i]+" ");
            }
        }
        System.out.print("\n");
        for(int i=9;i>=0;i--){
            System.out.print(num[i]);
        }
        System.out.print("\n");

        System.out.print(num[0]+" ");
        System.out.print(num[9]+" ");
    }
}
