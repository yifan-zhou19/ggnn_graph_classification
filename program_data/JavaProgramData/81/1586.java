package <missing>;

public class GlobalMembers
{
	public static int ch(int[][] a, int n, int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			int[] b = new int[5];
			for (int k = 0; k < 5; k++)
			{
				b[k] = a[m][k];
				a[m][k] = a[n][k];
				a[n][k] = b[k];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
	int[][] x = new int[5][5];
	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i][j] = Integer.parseInt(tempVar);
			}
		}
	}
	int m;
	int n;
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
	int r = ch(x, n, m);
	if (r == 0)
	{
		System.out.print("error");
	}
	else if (r == 1)
	{
		for (int w = 0; w < 5; w++)
		{
			int z = 0;
			for (z = 0; z < 4; z++)
			{
				System.out.printf("%d ", x[w][z]);
			}
			System.out.printf("%d\n", x[w][z]);
		}
	}
	return 0;
	}
}

