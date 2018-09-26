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
	int l;
	int m;
	int n;
	int N = 0;
	int[][] sz = new int[10][10];
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
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			m = 0;
			n = 0;
			for (k = 0;k < a;k++)
			{
				if (sz[i][j] < sz[k][j])
				{
					m++;
				}
			}
			for (l = 0;l < b;l++)
			{
				if (sz[i][j] > sz[i][l])
				{
					n++;
				}
			}
			if ((m == a - 1) && (n == b - 1))
			{
				System.out.printf("%d+%d\n",i,j);
				N++;
			}
		}
	}
	if (N == 0)
	{
	System.out.print("No");
	}
	return 0;
	}

}

