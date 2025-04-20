package net.testGuides;

public class Factorial {

    public int factorial(int number)
    {
        int fact = 1;

        for(int i = 1; i <= number;  i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj1 = new Factorial();
        int result = obj1.factorial(6);
        System.out.println(result);
    }

}
