package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int a;
		int b;
		int n;
		int m;
		int z;
		int f = 0;
		int[][] sz = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			B = Integer.parseInt(tempVar2);
		}
		for (a = 0;a < A;a++)
		{
			for (b = 0;b < B;b++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[a][b]) = Integer.parseInt(tempVar3);
			}
			}
		}
		int max = 0;
		int min = 1000;
		for (a = 0;a < A;a++)
		{
			for (b = 0;b < B;b++)
			{
				if ((sz[a][b]) > max)
				{
				max = (sz[a][b]);
				n = b;
				}
			}
			for (z = 0;z < A;z++)
			{
				if ((sz[z][n]) < min)
				{
				min = (sz[z][n]);
				m = z;

				}
			}
			if (max == min)
			{
				System.out.printf("%d+%d",m,n);
				f = f + 1;
			}

		}
		if (f == 0)
		{
		System.out.print("No");
		}
	return 0;

	}


}

