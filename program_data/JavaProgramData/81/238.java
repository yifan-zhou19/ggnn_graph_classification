package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int a;
	int b;
	int c;
	int i;
	int j;
	int[][] x = new int[5][5];
	int[] y = new int[5];
	int[] z = new int[5];
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[i][j] = Integer.parseInt(tempVar);
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
	if ((m <= 4) && (n <= 4))
	{
		for (i = m;i <= m;i++)
		{
			for (j = 0;j < 5;j++)
			{
			y[j] = x[i][j];
			}
		}
		for (i = n;i <= n;i++)
		{
			for (j = 0;j < 5;j++)
			{
			z[j] = x[i][j];
			}
		}

		for (i = m;i <= m;i++)
		{
			for (j = 0;j < 5;j++)
			{
			x[i][j] = z[j];
			}
		}
		for (i = n;i <= n;i++)
		{
			for (j = 0;j < 5;j++)
			{
			x[i][j] = y[j];
			}
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 4;j++)
		{
		System.out.printf("%d ",x[i][j]);
		}
		for (j = 4;j < 5;j++)
		{
		System.out.printf("%d",x[i][j]);
		}
		System.out.print("\n");
		}
	}
	else
	{
		System.out.print("error");
	}
	return 0;
	}


}

