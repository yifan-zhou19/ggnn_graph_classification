package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] a = new int[8][8];
		int b = 0;
		int[] c = new int[8];
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > a[i][j - 1])
				{
					b = j;
				}
				else
				{
					b = 0;
				}
			}
			for (k = 1;k < m;k++)
			{
				if (a[k][b] < a[k - 1][b])
				{
					c[i] = k;
				}
			}
			if (c[i] == i)
			{
				System.out.printf("%d+%d\n",b,i);
				l = l + 1;
			}
		}
		if (l == 0)
		{
			System.out.print("No\n");
		}


	}

}

