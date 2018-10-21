package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int f;
		int g;
		int b;
		int m;
		int n;
		int i;
		int j;
		int[] max = new int[8];
		int number = 0;
		int c;
		int flag = 1;
		int flag2 = 1;
		int p;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			g = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < f;i++)
		{
			for (j = 0;j < g;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (i = 0;i < f;i++)
			{
		m = 0;
	for (j = 0;j < g;j++)
	{
	if (a[i][m] <= a[i][j])
	{
		m = j,p = i;
	}
	}
	n = 0;
	for (i = 0;i < f;i++)
	{
	if (a[n][m] >= a[i][m])
	{
		n = i;
	}
	}
	{
		if (p == n)
		{
	System.out.printf("%d+%d",p,m);
		}
}
	number++;
			}
	if (p != n)
	{
	System.out.print("No");
	}
	}

}

