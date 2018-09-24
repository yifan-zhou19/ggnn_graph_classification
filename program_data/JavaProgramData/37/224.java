import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		char[][] a = new char[100][1000];
		char s;
		int i;
		int j;
		int l;
		int[][] b = new int[100][200];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < t;i++)
		{
		   a[i] = new Scanner(System.in).nextLine();
		   l = String.valueOf(a[i]).length();
		   for (j = 0;j < l;j++)
		   {
			   b[i][a[i][j]] = b[i][a[i][j]] + 1;
		   }
		   for (j = 0;j < l;j++)
		   {
			   if (b[i][a[i][j]] == 1)
			   {
				  System.out.print(a[i][j]);
				  System.out.print("\n");
				  break;
			   }
		   }
		   if (j == l)
		   {
		   System.out.print("no");
		   System.out.print("\n");
		   }
		}
		return 0;
	}
}

