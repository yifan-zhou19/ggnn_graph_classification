package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int z;
		if (x != y && x >= 0 && x <= 4 && y >= 0 && y <= 4)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
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
		if (f(n, m) == 0)
		{
			System.out.print("error");
		}
		if (f(n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				k = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = k;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
	}
}

