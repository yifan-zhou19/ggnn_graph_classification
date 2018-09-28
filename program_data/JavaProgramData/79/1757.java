package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int m;
		int[][] a = new int[300][300];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n != 0)
			{
			   for (i = 0;i < n;i++)
			   {
				   a[0][i] = i + 1;
			   }
			   for (i = n - 1;i > 0;i--)
			   {
				   for (k = 0;k < i;k++)
				   {
					   a[n - i][k] = a[n - i - 1][(m + k) % (i + 1)];
				   }
			   }
			   System.out.print(a[n - 1][0]);
			   System.out.print("\n");
			}
		}
		return 0;
	}
}

