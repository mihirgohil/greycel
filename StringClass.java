import java.util.*;
public class StringClass{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        String[] splitbySpace;
        String s;
        StringBuilder sr = new StringBuilder();
        System.out.println("Enter String : ");
        String inputStrVar = sc.nextLine();
        System.out.println("\n\nInput String : "+inputStrVar);
        String[] arString = inputStrVar.split("\\.");
        
        for(int i=0; i < arString.length;i++)
        {
            splitbySpace = arString[i].split(" ");
            for(int j=splitbySpace.length-3; j >= 0;j--)
            {   
                    sr.append(" "+splitbySpace[j]);
            }
            for(int g=3; g < splitbySpace.length;g++)
            {   
                    sr.append(" "+splitbySpace[g]);
            }
            sr.append(".");
        }
        System.out.println("\n\nOutput : "+sr);
    }
}