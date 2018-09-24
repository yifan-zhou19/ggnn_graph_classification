import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[101]);
	 a = new Scanner(System.in).nextLine();
	 for (int i = 0; i < a.length(); ++i)
	 {
	  if (a.charAt(i) != ' ')
	  {
	   if (i == a.length())
	   {
		   System.out.print(a.charAt(i));
	   }
	   else
	   {
	   if (a.charAt(i + 1) == ' ')
	   {
	   System.out.print(a.charAt(i));
	   System.out.print(" ");
	   }
	   else
	   {
	   System.out.print(a.charAt(i));
	   }
	   }
	  }
	 }
	 //while(1);
	 return 0;
	}

}
