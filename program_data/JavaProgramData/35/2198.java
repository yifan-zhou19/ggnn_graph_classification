package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int i;
		int j;
		int m;
		int n;
		int k;
		int l;
		int d = 0;
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
			k = a[i][0];
			l = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > k)
				{
					k = a[i][j];
					l = j;
				}
			}
				for (j = 0;j < m;j++)
				{
					if (a[j][l] < k)
					{
						k = a[j][l];
					}
				}
				if (k == a[i][l])
				{
					System.out.printf("%d+%d",i,l);
					d = 1;
					break;
				}
		}
		if (d == 0)
		{
			System.out.print("No");
		}
	}


}

