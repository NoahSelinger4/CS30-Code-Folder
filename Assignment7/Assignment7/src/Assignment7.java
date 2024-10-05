//Program Name: Assignment7
//Student Name: Noah Selinger
//Date: October 5th 2024
//Program Description:A program that changes two messages and prints them 

public class Assignment7 {
    public static void main(String[] args)
    {
        String message1 = "I am very happy!";
        String target1 = "very ";

        String message2 = "That was great - lol.";
        String target2 = "lol";

        //Part1
        int index1 = message1.indexOf(target1);
        int wordlength = target1.length();
        String newmessage1 = message1.substring(0,index1) + message1.substring(index1+wordlength);
        System.out.println(newmessage1);

        //Part2
        int index2 = message2.indexOf(target2);
        String newmessage2 = message2.substring(0,index2) + "laugh out loud.";
        System.out.println(newmessage2);
    }
}
