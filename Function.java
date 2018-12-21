import java.util.Scanner;

public class Function {
    static boolean func(String str){
        boolean[] b=new boolean[26];
        for(int i=0;i<str.length();i++){  
            if(str.charAt(i)>=97&&str.charAt(i)<=122)
                b[str.charAt(i)-'a']=true;
        }
        for(int i=0;i<26;i++)
            if(b[i]==false)
                return false;
            return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(func(str))
        System.out.println("String contains all the characters of alphabet");
        else
            System.out.println("String does not contain all the characters of alphabet");
    }
}
