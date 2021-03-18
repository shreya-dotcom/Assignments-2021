/*
Write a Java program to sort an array of given integers using the Bubble sorting Algorithm.
 */

package com.target.ignite;
import java.util.*;

public class Que_8a {

    public static void BubbleSort(int[] arr ,int n ) //Bubble sort algo
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])      // checks for the larger number
                {
                    int temp = arr[i]; //Does swapping of smaller number with the larger
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char response;

        do {
            //get the inputs from user
            System.out.println("Enter the size of an array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of an array :");
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            BubbleSort(arr,n); //call for method to sort an array

            System.out.println("Sorted elements of the array by Bubble Sort : ");
            for(int i=0;i<n;i++) //print the sorted array
            {
                System.out.println(arr[i]);
            }

            System.out.println("Do you want to continue ? (y/n)");
            response = sc.next().charAt(0);
            if(response!='y' && response!='n')
            {
                System.out.println("Enter proper response ..");
                response = sc.next().charAt(0);
            }
        }while(response!='n');

    }

}

/*
   OUTPUT :
   "C:\Program Files\Java\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=61355:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\WIN10\IdeaProjects\Edureka\out\production\Edureka com.target.ignite.Que_8a
Enter the size of an array :
5
Enter the elements of an array :
10
20
30
40
50
Sorted elements of the array by Bubble Sort :
50
40
30
20
10
Do you want to continue ? (y/n)
y
Enter the size of an array :
3
Enter the elements of an array :
60
50
10
Sorted elements of the array by Bubble Sort :
60
50
10
Do you want to continue ? (y/n)
u
Enter proper response ..
y
Enter the size of an array :
5
Enter the elements of an array :
80
50
60
70
90
Sorted elements of the array by Bubble Sort :
90
80
70
60
50
Do you want to continue ? (y/n)
n

Process finished with exit code 0


 */