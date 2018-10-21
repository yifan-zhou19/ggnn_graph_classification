package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[][] a = new int[8][8];
		int[] m = new int[8];
		int[] p = new int[8];
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (a[i][j] >= m[i])
				{
					m[i] = a[i][j];
				}
			}
		}
		for (j = 0;j < k;j++)
		{
			p[j] = a[0][j];
			for (i = 0;i < n;i++)
			{
				if (a[i][j] <= p[j])
				{
					p[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (m[i] == p[j])
				{
					System.out.printf("%d+%d",i,j);
					q = q + 1;
				}

			}
		}
		if (q == 0)
		{
			System.out.print("No");
		}
		return 0;
	}




}

