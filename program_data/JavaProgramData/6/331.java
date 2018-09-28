package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int m;
			int n;
			int i;
			int j;
			int[][] a = new int[100][100];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++) //??
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (j = 0;j < n;j++)
			{ //??????????
				sum += a[0][j];
				sum += a[m - 1][j];
			}
			i = 1;
			while (i < m - 1)
			{ //?????
			   sum += a[i][0];
			   sum += a[i][n - 1];
			   i++;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}

}

