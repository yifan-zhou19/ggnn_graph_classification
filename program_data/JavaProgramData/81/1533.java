package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int n, int m)
	{
		int z;
		int[] c = new int[5];
		int j;
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
			for (j = 0;j < 5;j++)
			{
				c[j] = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = c[j];
			}
			z = 1;
		}
		if (m > 4 || n > 4)
		{
			z = 0;
		}
		return (z);
	}

	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
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
			if (change(a, n, m) == 0)
			{
				System.out.print("error");
			}
			else
			{
				for (i = 0;i < 5;i++)
				{
					System.out.print("\n");
				System.out.printf("%d %d %d %d %d",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
				}
			}
	}
}

