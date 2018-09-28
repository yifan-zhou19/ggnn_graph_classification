package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] n = new int[8][8];
	int[][] m = new int[8][8];
	int i;
	int j;
	int a;
	int c = 0;
	int b;
	int t = 0;
	int p;
	int q;
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
			m[i][j] = 0;
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
	for (i = 0;i < a;i++)
	{
		int x = 0;
		for (j = 0;j < b - 1;j++)
		{
			if (n[i][x] < n[i][j + 1])
			{
				x = j + 1;
			}
		}
		m[i][x] = 1;
	}
	for (j = 0;j < b;j++)
	{
		int y = 0;
		for (i = 0;i < a - 1;i++)
		{
			if (n[y][j] > n[i + 1][j])
			{
				y = i + 1;
			}

		}
		m[y][j]++;
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			if (m[i][j] == 2)
			{
				t = 1;
				p = i;
				q = j;
			}
		}
	}
	if (t == 1)
	{
		System.out.printf("%d+%d",p,q);
	}
	else
	{
		System.out.print("No");
	}
	return 0;
	}

}

