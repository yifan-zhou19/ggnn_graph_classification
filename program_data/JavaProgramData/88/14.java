import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[100]);
	   char[][] out = new char[100][100];
	   int len;
	   int k;
	   int i = 0;
	   int j = 0;
	   int m;
	   str = new Scanner(System.in).nextLine();
	   len = str.length();
	   for (k = 0;k < len;k++)
	   {
		  if (str.charAt(k) >= '0' && str.charAt(k) <= '9')
		  {
			 out[i][j] = str.charAt(k);
			 j++;
		  }
		  else if (str.charAt(k - 1) >= '0' && str.charAt(k - 1) <= '9')
		  {
			 i++;
			 j = 0;
		  }
		  else
		  {
			  continue;
		  }
	   }
	   for (m = 0;m <= i;m++)
	   {
		  if (out[m].equals("\0"))
		  {
			  break;
		  }
		  System.out.print(out[m]);
		  System.out.print("\n");
	   }
	   return 0;
	}
}
