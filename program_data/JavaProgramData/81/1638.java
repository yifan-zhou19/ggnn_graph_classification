package <missing>;

public class GlobalMembers
{
	public static int function(int[][] a, int n, int m)
	{
		if ((m < 0 || m>4) || (n < 0 || n>4))
		{
			return 0;
		}
		else
		{
			int i;
			for (i = 0;i < 5;i++)
			{
				int temp = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = temp;
			}
			return 1;
		}
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		int b = function(a, n, m);
		if (b == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ", a[i][j]);

					}
					else
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}
		return 0;


	}
}

