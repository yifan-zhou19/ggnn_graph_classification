package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[5][5];
	public static void exchange(int m, int n)
	{
		if (m > 4 || m < 0 || n>4 || n < 0)
		{
			System.out.print("error");
		}
		else
		{
			int[] a = new int[5];
			int k;
			int t;
			for (k = 0;k < 5;k++)
			{
				a[k] = sz[m][k];
				sz[m][k] = sz[n][k];
				sz[n][k] = a[k];
			}
			for (k = 0;k < 5;k++)
			{
				for (t = 0;t < 4;t++)
				{
					System.out.printf("%d ",sz[k][t]);
				}
				System.out.printf("%d\n",sz[k][4]);
			}
		}
	}
	public static int Main()
	{


		int a;
		int b;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		exchange(a, b);


		return 0;
	}

}

