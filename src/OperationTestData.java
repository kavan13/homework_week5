/* Write a Java program to print the result of the following operations.
Test Data: a. -5 + 8 * 6
 b. (55+9) % 9
 c. 20 + -3*5 / 8
 d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output : 43
 1
 19
 13
*/

public class OperationTestData {    //This is class
    public static void main(String [] args){    //Main method
        int a=5,b=8,c=6,d=55,e=9,f=20,g=3,h=15,i=2,j,k,l,m;

        //These are Mathes Equations
        j = -a + (b * c);
        k = (d+e) % e;
        l = f + (-g*a) / b;
        m = a + h / g * i - b % g;

        //These are print statements
        System.out.println("Expected Output is :");
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

    }


}
