package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int temp1;
		int temp2;
		int i;
		int j;
		int a;
		int b;
		int k;
		int c;
		int d;
		int e;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		temp1 = 0;
		temp2 = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n && temp1 == 0; i++)
		{
			for (j = 0; j < n && temp1 == 0; j++)
			{
				if (sz[i][j] == 0 && sz[i + 1][j] == 0 && sz[i][j + 1] == 0)
				{
					a = i;
					b = j;
					temp1 = 1;
				}
			}
		}
		for (i = a; i < n && temp2 == 0; i++)
		{
			for (j = b; j < n && temp2 == 0; j++)
			{
				if (sz[i][j] == 0 && sz[i - 1][j] == 0 && sz[i][j - 1] == 0)
				{
					c = i;
					d = j;
					temp2 = 1;
				}
			}
		}
		e = (c - a - 1) * (d - b - 1);
		System.out.printf("%d", e);
		return 0;
	}


}

