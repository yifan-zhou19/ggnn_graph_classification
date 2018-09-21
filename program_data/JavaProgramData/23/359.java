import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50];
		String str = new String(new char[100]);
		char[][] de = new char[50][100];
		str = new Scanner(System.in).nextLine();
		int i;
		int k;
		int j = 0;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
		  if (str.charAt(i) != ' ')
		  {
		  de[j][a[j]] = str.charAt(i);
		  a[j]++;
		  }
		  else
		  {
			  j++;

		  }
		}
		for (i = j;i > 0;i--)
		{
			for (k = 0;k < a[i];k++)
			{
				System.out.print(de[i][k]);
			}
			System.out.print(" ");
		}
	   for (k = 0;k < a[0];k++)
	   {
				System.out.print(de[0][k]);
	   }
		return 0;
	}
}
