package <missing>;

public class GlobalMembers
{
	public static void trans(int m, int n)
	{

		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (n > 4 || m > 4)
		{
		System.out.print("error\n");
		}
		else
		{
		for (j = 0;j < 5;j++)
		{
			t = a[m][j];
			a[m][j] = a[n][j];
			a[n][j] = t;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][j]);
		}
		}
	}

	public static int Main()
	{
		int m;
		int n;
		trans(m, n);
		return 0;
	}

}

