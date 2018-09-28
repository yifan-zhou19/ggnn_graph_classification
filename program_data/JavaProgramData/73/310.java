package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int k;
		int m = 0;
		int n;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			n = 0;
			for (k = 0;k < 5;k++)
			{
				if (a[k][j] >= a[i][j] != 0 && a[i][k] <= a[i][j])
				{
					 n = n + 1;
				}
			}
			if (n == 5)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(j + 1);
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
		   else
		   {
			   m = m + 1;
		   }
		}
		}
			if (m == 25)
			{
				System.out.print("not found");
			}
			return 0;
	}
}

