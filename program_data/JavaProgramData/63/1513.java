package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int x;
		int y;
		int p;
		int q;
		int k;
		int m;
		int n;
		int sum = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		for (n = 0;n < i;n++)
		{
			for (m = 0;m < j;m++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[n][m] = Integer.parseInt(tempVar3);
				}
			}

		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		for (n = 0;n < x;n++)
		{
			for (m = 0;m < y;m++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[n][m] = Integer.parseInt(tempVar6);
				}
			}

		}
		for (p = 0;p < i;p++)
		{
			for (q = 0;q < y;q++)
			{
				for (k = 0;k < j;k++)
				{
					t = a[p][k] * b[k][q];
					sum = sum + t;
					c[p][q] = sum;
				}
				sum = 0;
			}
		}
		for (p = 0;p < i;p++)
		{
			for (q = 0;q < y;q++)
			{
				if (q < y - 1)
				{
					System.out.printf("%d ",c[p][q]);
				}
				if (q == y - 1 && p != i - 1)
				{
					System.out.printf("%d\n",c[p][q]);
				}
				if (q == y - 1 && p == i - 1)
				{
					System.out.printf("%d",c[p][q]);
				}
			}
		}
		return 0;


	}
}

