package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] z = new int[6][6];
		int a;
		int b;
		int c;
		int e;
		int f;
		f = 0;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					z[a][b] = Integer.parseInt(tempVar);
				}
			}
		}
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				e = 0;
				for (c = 1;c <= 5;c++)
				{
					if (z[a][b] <= z[a][c])
					{
						e += 1;
					}
					if (z[a][b] >= z[c][b])
					{
						e += 1;
					}
				}
				if (e == 2)
				{
						System.out.printf("%d %d %d",a,b,z[a][b]);
						f = 1;
				}
			}
		}
		if (f == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

