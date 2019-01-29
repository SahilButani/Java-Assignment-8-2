import java.util.Scanner;

public class CheckAlphabets {
    /*
     * Main method takes input string from user and passes it to checkAllAlphabets function
     * If function returns boolean value and prints the output accordingly.
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input_string=sc.nextLine();

        boolean contains_all_characters=allAlphabetsPresent(input_string);

        if(contains_all_characters) {
            System.out.println("String contains all the characters of alphabet");
        }
        else{
            System.out.println("String does not contain all the characters of alphabet");
        }
    }

    /*
     * This function takes string as input and checks if all the characters
     * from 'a' to 'z' are present or not. If all characters are present
     * return true.
     */
    static boolean allAlphabetsPresent(String input_string){
        boolean[] isCharacter=new boolean[26];
        for(int i=0;i<input_string.length();i++){
            if(input_string.charAt(i)>=97&&input_string.charAt(i)<=122)
                isCharacter[input_string.charAt(i)-'a']=true;
        }
        for(int i=0;i<26;i++) {
            if (isCharacter[i] == false) {
                return false;
            }
        }
        return true;
    }


}
// Time Complexity is O(n) and space complexity is O(1).
/*
TEST CASES:
1)
input:abcdefghijklmnopqrstuvwxyz
output: String contains all the characters of alphabet

2)
input:aaaaaaaaaaaaaaaaaaa
output:String does not contain all the characters of alphabet

3)
input:(no input)
output:String does not contain all the characters of alphabet

4)
input:abcbvbdefggrghijksddfdslmfnopqffrstudfsvwxyz.adf34adc
output:String contains all the characters of alphabet

5)
sahilButani fesd
output:String does not contain all the characters of alphabet


*/



