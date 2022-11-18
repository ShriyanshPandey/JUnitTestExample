package JUnitTestPackage;
import java.util.*;

public class JUnitFunctions {
	public static void Addnumber(int a,int b){
        System.out.println(a+b);
    }
	public static void AddString(String a,String b){
        System.out.println(a+b);
    }

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Integers:");
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("Enter Strings:");
    s.nextLine();
    String c=s.nextLine();
    String d=s.nextLine();
    Addnumber(a,b);
    AddString(c,d);
    }
}

