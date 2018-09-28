package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] a = new int[50000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		int t;
		for (int k = 1;k <= n;k++)
		{
				for (int x = 0;x < n - k;x++)
				{
					if (a[x][0] > a[x + 1][0])
					{
						t = a[x][0];
						a[x][0] = a[x + 1][0];
						a[x + 1][0] = t;

						t = a[x][1];
						a[x][1] = a[x + 1][1];
						a[x + 1][1] = t;

					}
				}
		}
	int bi = 0;
	int max = a[0][1];
	for (i = 1;i < n;i++)
	{
		if (a[i][0] > max)
		{
			System.out.print("no");
			bi = 1;
			break;
		}
		else
		{
			if (a[i][1] > max)
			{
				max = a[i][1];
			}
		}
	}
	if (bi == 0)
	{
		System.out.printf("%d %d",a[0][0],max);
	}
	return 0;
	}


}

