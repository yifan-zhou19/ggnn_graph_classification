package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int j;
		int k;
		int z = 0;
		int n;
		int m;
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
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (k = 0;k < 5;k++)
			{
				b[k] = a[m][k];
				a[m][k] = a[n][k];
				a[n][k] = b[k];
			}
			z = 1;
		}
		if (z == 0)
		{
			System.out.print("error");
		}
		if (z == 1)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 4;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.printf(" %d\n",a[i][4]);
			}
		}
		return 0;
	}

}

