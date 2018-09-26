package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int s;
		int[][] sz = new int[100][100];
		int a;
		int b;
		int max = 0;
		int min = 100;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
					a = i;
					b = j;
				}
			}
			for (s = 0;s < n;s++)
			{
				if ((sz[s][b]) < min)
				{
					min = sz[s][b];
				}
			}
			if (min == sz[a][b])
			{
				t = 1;
				System.out.printf("%d+%d",a,b);

			}
		}
			if (t == 0)
			{
				System.out.print("No\n");
			}
			return 0;
	}
}

