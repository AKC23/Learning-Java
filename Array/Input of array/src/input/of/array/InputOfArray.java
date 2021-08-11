
package input.of.array;

import java.util.Scanner;
public class InputOfArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int arr1[] = new int[20];
        int i,j=0,n=0;

        //process 1
        for(i=2;i<8;i++)
        {
            arr1[i] = j;
            j++;
            System.out.println(arr1[i]);
        }
        System.out.println("Length of arr1 : "+arr1.length);

        //process 2
        int arr2[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("We have "+arr2[3]+" days");
        System.out.println("Length of arr2 : "+arr2.length);


        //process 3
        int arr3[] = new int [10];
        System.out.println("Give input : ");
        for(i=0;i<5;i++)
        {
            n = input.nextInt();
            arr1[i] = n;
        }
        
        for(i=0;i<5;i++)
        {
            System.out.println(arr1[i]);
        }
        
        System.out.println("Length of arr3 : "+arr3.length);
        
    }
    
}
