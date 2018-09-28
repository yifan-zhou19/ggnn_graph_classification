import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] b = new int[100][81];
		int[] c = new int[100];
		int l;
	char[][] a = new char[100][81];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	for (i = 0;i < n;i++)
	{
		 a[i] = new Scanner(System.in).nextLine();
	  c[i] = String.valueOf(a[i]).length();
	  for (j = 0;j < c[i];j++)
	  {
	  b[i][j] = a[i][j];
	  }

	  l = 1;
	  if ((b[i][0] >= 65 && b[i][0] <= 90) || (b[i][0] >= 97 && b[i][0] <= 122) || b[i][0] == 95)
	  {
	   for (j = 1;j < c[i];j++)
	   {
		   if ((b[i][j] >= 65 && b[i][j] <= 90) || (b[i][j] >= 97 && b[i][j] <= 122) || (b[i][j] >= 48 && b[i][j] <= 57) || b[i][j] == 95)
		   {
		 l++;
		   }
	   }
		if (l == c[i])
		{
		System.out.print("1");
		System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
	  }
	  else
	  {
		  System.out.print("0");
		  System.out.print("\n");
	  }
	}
	 return 0;
	}


}

