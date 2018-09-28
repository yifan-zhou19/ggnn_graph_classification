import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[100]);
	 while (str = new Scanner(System.in).nextLine())
	 {
	  if (str.charAt(0) == '\n')
	  {
	   continue;
	  }
	  int slen = str.length();
	  for (char * p = str; p != str.charAt(slen); p++)
	  {
	   if (p == ' ')
	   {
		if (*(p + 1) != ' ')
		{
		 System.out.print(' ');
		}
	   }
	   else
	   {
		System.out.print(p);
	   }
	  }
	  System.out.print("\n");
	 }
	 return 0;
	}

}
