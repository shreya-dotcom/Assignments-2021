/*
 Q9. Write a program to find Leap year
 */

package com.target.ignite;

import java.util.*;

public class Que_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char response;
        do{
            System.out.println("Enter a year :");
            int year = sc.nextInt();

            int cnt=0;
            int y_chk=year;
            while(y_chk>0)          //checks if year is 4 digit or not
            {
                y_chk = y_chk/10;
                cnt++;
            }


            if(year<0 || cnt!=4)    //if year is not positive or 4 digit
            {
                System.out.println("Enter appropriate year :");
                year = sc.nextInt();
                cnt=0;
                int y = year;
                while(y>0)         //checks digit validity of year
                {
                    y = y/10;
                    cnt++;
                }

            }


            if(cnt==4)
            {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)     //the year divisible by 4 and doesn't contain 0's at the end
                {                                                              // or 400 is leap year
                    System.out.println("The year " + year + " is a leap year.");
                } else {
                    System.out.println("The year " + year + " is not a leap year.");
                }

            }


            System.out.println("Do you want to execute the code again?(y/n) ");
            response = sc.next().charAt(0);
            if(response!='y' && response!='n')
            {
                System.out.println("Enter your response again..");
                response = sc.next().charAt(0);
            }

        }while(response!='n');

    }
}


/*
OUTPUT :


"C:\Program Files\Java\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=58497:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\WIN10\IdeaProjects\Edureka\out\production\Edureka com.target.ignite.Que_9
Enter a year :
14258
cnt0 : 5
Enter appropriate year :
1700
cnt1 : 4
The year 1700 is not a leap year.
Do you want to execute the code again?(y/n)
y
Enter a year :
2000
cnt0 : 4
The year 2000 is a leap year.
Do you want to execute the code again?(y/n)
m
Enter your response again..
y
Enter a year :
1600
cnt0 : 4
The year 1600 is a leap year.
Do you want to execute the code again?(y/n)
n

Process finished with exit code 0

 */