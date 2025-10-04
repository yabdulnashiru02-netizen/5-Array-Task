import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        int[] Array ={2,5,8,3,4,6,10,15,20,1,11};
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number in the Array:");
        // int val = input.nextInt();
        // //task 1
        // for (int i = 0; i < Array.length ; i++){
        //     if (val== Array[i]){
        //         System.out.print(i);
            }
        }
        //task 2
        System.out.print("Enter first number to swap: ");
        int num1 =input.nextInt();
        System.out.print("Enter second number to swap: ");
        int num2= input.nextInt();
        int index1 =-1;
        int index2=-1;

        for (int i = 0; i < Array.length ; i++){
            if (Array[i]== num1){
                index1 =i;
            }
            if(Array[i]==num2){
                index2 =i;
            }
        if (index1 != -1 && index2!= -1){
            int now = Array[index1];
            Array[index1] =Array[index2];
            Array[index2]=now;
            System.out.println("Array after swapping:");
            for (int n : Array) {
                System.out.print(n + " ");
        }
        System.out.println();
    }
        }
    }
}