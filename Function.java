import java.util.Scanner;

public class Function {
    /*
     * This function takes string as input and checks if all the characters
     * from 'a' to 'z' are present or not. If all characters are present 
     * return true.
     */
    static boolean func(String input_string){
        boolean[] isCharacter=new boolean[26];
        for(int i=0;i<input_string.length();i++){  
            if(input_string.charAt(i)>=97&&input_string.charAt(i)<=122)
                isCharacter[input_string.charAt(i)-'a']=true;
        }
        for(int i=0;i<26;i++)
            if(isCharacter[i]==false)
                return false;
            return true;
    }
    /*
     * Main method takes input string from user and passes it to checkAllAlphabets function
     * If function returns boolean value and prints the output accordingly.
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input_string=sc.nextLine();
        if(func(input_string))
        System.out.println("String contains all the characters of alphabet");
        else
            System.out.println("String does not contain all the characters of alphabet");
    }
}
// Time Complexity is O(n) and space complexity is O(1).
