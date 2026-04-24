package tests;

public class uplowercase {
    public static void main(String[] args) {

        String s1="SharanaKumar";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        char[] arr1=s1.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

    }
}
