package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i;
	int j;
	int k;
	int m;
	int n;
	int p;
	p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	int[][] c = new int[10][10];
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(c[i][j]) = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			for (k = 0;k < b;k++)
			{
				if (c[i][j] < c[i][k])
				{
					break;
				}
				if (k == (b - 1) || (j == (b - 1) && k == (b - 2)))
				{
					n = 1;
				}
			}
				if (n == 1)
				{
				for (m = 0;m < a;m++)
				{
				if (c[i][j] > c[m][j])
				{
					n = 0;
					break;
				}
					if (m == (a - 1) || (i == (a - 1) && m == (a - 2)))
					{
							System.out.printf("%d+%d\n",i,j);
									n = 0;
									p = 1;
									break;
					}
				}
				}
		}
	}
	if (p == 0)
	{
		System.out.print("No");
	}
	return 0;
	}

}

