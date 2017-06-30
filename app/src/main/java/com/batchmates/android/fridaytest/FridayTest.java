package com.batchmates.android.fridaytest;

/**
 * Created by Android on 6/30/2017.
 */

public class FridayTest {


    public static void main(String[] args) {

    int[] thisArray={1,2,2,2,3,4};


        if(palindrome("racecar")==true)
        {
            System.out.println("Is a palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

        System.out.println("Most occured number is "+ occurance(thisArray));


        isDivisible(5);

        if(armStrong(5)!=true)
        {
            System.out.println("Not an armstrong number");
        }
        else
        {
            System.out.println("Armstrong Number");
        }

    }


    public static boolean palindrome(String s)
    {

        int length=s.length();

        for (int i = 0; i <length/2 ; i++)
        {

            if(s.charAt(i)!=s.charAt(length-i-1))
            {
                return false;
            }
        }
            return true;
    }


public static int occurance(int[] theArray)
{
    int lastCount=0;
    int currentCount=0;
    int largestByCount=0;


    for (int i = 0; i <theArray.length ; i++)
    {
        for (int j = i; j <theArray.length ; j++)
        {
            if(theArray[i]==theArray[j])
            {
                currentCount++;
            }
        }
        if (currentCount>lastCount)
        {
            largestByCount=theArray[i];
            lastCount=currentCount;
        }
        currentCount=0;
    }

    return largestByCount;
}



public static void isDivisible(int number)
{
    String s="";

    if (number%3==0)
    {
        s=s+"fizz";
    }
    if (number%5==0)
    {
        if(s=="")
        {
            s=s+"buzz";
        }else
        {
            s=s+" buzz";
        }
    }
    if(s=="")
    {
        s=s+number;
    }

    System.out.println(s);

}

public static boolean armStrong(int number)
{
    String s=String.valueOf(number);
    int length=s.length();
    int checking=0;
    int current=0;
    int sum=1;
    String currentString;

    for (int i = 0; i <length ; i++)
    {
        currentString=String.valueOf(s.charAt(i));
        sum=1;
        current= Integer.valueOf(currentString);
        System.out.println("current is "+ s.charAt(i) +" "+current);
        for (int j = 0; j <length ; j++)
        {
            sum=sum*current;
        }
        checking+=sum;
        System.out.println("check is "+checking);
    }

    if(checking==number)
    {
        return true;
    }
    return false;
}



}
