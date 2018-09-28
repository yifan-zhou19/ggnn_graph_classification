package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int m, int n)
	{
		int z;
		int t;
		int i;
		int j;
		if ((m > 4 || m < 0) || (n>4 || n < 0))
		{
			z = 0;
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				t = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = t;
				z = 1;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}

		}
		return (z);
	}

	public static void Main()
	{
		int[][] a = new int[5][5];
		int p;
		int q;
		int m;
		int n;
		for (p = 0;p < 5;p++)
		{
				for (q = 0;q < 5;q++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[p][q] = Integer.parseInt(tempVar);
					}
				}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		change(a, m, n);
	}
}

