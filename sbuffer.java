// code to toggle the case in the  given string
//String Buffer
import java.io.*;
import java.util.*;
public class sbuffer{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
String A=s.next();
StringBuffer sb= new StringBuffer(A);
for(int i=0;i<A.length();i++)
{
char ch=A.charAt(i);
if(ch>='A' && ch<='Z')
{
ch=(char)((int)ch+32);
sb.setCharAt(i,ch);
}
else
{
ch=(char)((int)ch-32);
sb.setCharAt(i,ch);
}
}
System.out.println(sb);
}

}
//output:
IamSample
iAMsAMPLE