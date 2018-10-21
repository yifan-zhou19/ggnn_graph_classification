package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int a;
		int b;
		int i;
		int h;
		int s;
		int t;
		int p;
		int[][] sz = new int[100][100];
		int[] result = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (a = 0;a < n;a++)
			{
				for (b = 0;b < m;b++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[a][b] = Integer.parseInt(tempVar4);
					}
				}
			}
			h = 0,s = 0,t = 0,p = 0;
			for (b = 0;b < m;b++)
			{
				h = h + sz[0][b];
				if (n > 1)
				{
				s = s + sz[n - 1][b];
				}
			}
			for (a = 1;a < n - 1;a++)
			{
				t = t + sz[a][0];
				if (m > 1)
				{
				p = p + sz[a][m - 1];
				}
			}
			result[i] = h + s + t + p;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}


}

