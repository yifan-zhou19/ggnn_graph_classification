package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int i;
		int k;
		int t;
		int a;
		int b;
		int m;
		int n;
		int p;
		int q = 0;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		for (m = 0;m < 5;m++)
		{
			p = 0;
			t = -100;
			for (n = 0;n < 5;n++)
			{
				if (sz[m][n] > t)
				{
					t = sz[m][n];
					a = m;
					b = n;
				}
			}
			for (i = 0;i < 5;i++)
			{
				if (sz[i][b] >= sz[a][b])
				{
					p++;
				}
			}
			if (p == 5)
			{
				System.out.printf("%d %d %d",a + 1,b + 1,sz[a][b]);
			}
			else
			{
				q++;
			}
		}
		if (q == 5)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

