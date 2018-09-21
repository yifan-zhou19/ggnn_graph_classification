import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100]);
		char[][] b = new char[100][100];
	   int i = 0;
	   int j = 0;
	   int k = 0;
	   word = new Scanner(System.in).nextLine();
	   while (word.charAt(i) != '\0')
	   {
		   if (word.charAt(i) != ' ')
		   {
			   b[j][k] = word.charAt(i);
			   k = k + 1;
		   }
		   else
		   {
			   b[j][k] = '\0';
			   j = j + 1;
			   k = 0;
		   }
		   i = i + 1;
	   }
	   b[j][k] = '\0';
	   for (i = j;i > 0;i--)
	   {
		  System.out.print(b[i]);
		  System.out.print(" ");
	   }
		  System.out.print(b[0]);
		  System.out.print("\n");
	   return 0;
	}

}
