import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[2][80];
		int i;
		int j;
		for (i = 0;i < 2;i++)
		{
		  a[i] = new Scanner(System.in).nextLine();
		  for (j = 0;j < String.valueOf(a[i]).length();j++)
		  {
			  if (a[i][j] >= 'A' && a[i][j] <= 'Z')
			  {
			a[i][j] = a[i][j] + 32;
			  }
		  }
		}
		if (strcmp(a[0],a[1]) == 1)
		{
			System.out.print('>');
			System.out.print("\n");
		}
		else if (strcmp(a[0],a[1]) == 0)
		{
			System.out.print('=');
			System.out.print("\n");
		}
		else if (strcmp(a[0],a[1]) == -1)
		{
			System.out.print('<');
			System.out.print("\n");
		}
		return 0;
	}
}
