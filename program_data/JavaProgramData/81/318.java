package <missing>;

public class GlobalMembers
{
	public static void ox(int[][] a, int m, int n)
	{
		int i;
		int j;
		int[] t = new int[5];

			if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
			{
				for (i = 0;i <= 4;i++)
				{
					t[i] = a[m][i];
					a[m][i] = a[n][i];
					a[n][i] = t[i];
				}
					for (i = 0;i <= 4;i++)
					{
				for (j = 0;j <= 3;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][4]);
							System.out.print("\n");
					}
			}
			else
			{
				System.out.print("error\n");
			}

	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[5][5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		ox(a, m, n);
	}


}

