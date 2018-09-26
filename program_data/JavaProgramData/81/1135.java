package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int func = new int(int a[5][5],int n, int m);
		int n;
		int m;
		int i;
		int j;
		int t;
		int[][] a = new int[5][5];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		t = func(a, n, m);
		if (t == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d", a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d", a[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

	public static int func(int[][] a, int n, int m)
	{
		int i;
		int z;
		int[] b = new int[5];
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = b[i];
			}
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}

}

