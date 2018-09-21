import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[100][100];
	   int i = 0;
	   int j = 0;
	   int k = 0;
	   String f = new String(new char[100]);
	   f = new Scanner(System.in).nextLine();
	   for (i = 0;i < f.length();i++)
	   {
		   if (f.charAt(i) == ' ')
		   {
			   k++;
			   j = 0;
			   continue;
		   }
		   word[k][j] = f.charAt(i);
		   j++;
	   }
	   for (i = k;i > 0;i--)
	   {
		  System.out.print(word[i]);
		  System.out.print(" ");
	   }
		  System.out.print(word[0]);
		  System.out.print("\n");
	   return 0;
	}

}
