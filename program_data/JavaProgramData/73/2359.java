package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int k;
		int counter = 0;
		int s;
		int n;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (n = 0;n < 5;n++)
		{
			m = a[n][0];
			k = 0;
			for (j = 1;j < 5;j++)
			{

				if (a[n][j] > m)
				{
					 m = a[n][j];
					 k = j;
				}

			}
			s = a[0][k];
			for (i = 1;i < 5;i++)
			{
				if (a[i][k] < s)
				{
					s = a[i][k];
				}
			}
			if (s == m)
			{
				System.out.printf("%d %d %d\n",n + 1,k + 1,m);
				counter++;
			}
		}
		if (counter == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}

}

