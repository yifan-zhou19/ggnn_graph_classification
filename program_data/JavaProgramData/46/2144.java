package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int sum = 0;
		int c;
		int e;
		int f;
		int m;
		int n;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][0] = Integer.parseInt(tempVar3);
			}
			for (j = 1;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (c = 0,e = m,f = n;;c++,e--,f--)
		{
			for (j = c;j < f;j++)
			{
				System.out.printf("%d\n",a[c][j]);
				sum++;
			}
			if (sum == m * n)
			{
				break;
			}
			for (i = c + 1;i < e;i++)
			{
				System.out.printf("%d\n",a[i][f - 1]);
				sum++;
			}
			if (sum == m * n)
			{
				break;
			}
			for (j = f - 2;j > c - 1;j--)
			{
				System.out.printf("%d\n",a[e-1][j]);
				sum++;
			}
			if (sum == m * n)
			{
				break;
			}
			for (i = e-2;i > c;i--)
			{
				System.out.printf("%d\n",a[i][c]);
				sum++;
			}
			if (sum == m * n)
			{
				break;
			}
		}
		return 0;
	}

}

