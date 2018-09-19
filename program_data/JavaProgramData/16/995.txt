import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
	   String a = new String(new char[5]);
	   char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,' ',(Character.SIZE / Byte.SIZE));
		  a = new Scanner(System.in).nextLine();
		  for (i = 5;i >= 0;i--)
		  {
			if (a.charAt(i) == '0' || a.charAt(i) == '1' || a.charAt(i) == '2' || a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5' || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8' || a.charAt(i) == '9')
			{
			  System.out.print(a.charAt(i));
			}
		  }
	return 0;
	}




}
