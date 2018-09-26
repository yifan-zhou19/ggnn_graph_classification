package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int[][] a = new int[100][100];
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			max = a[i][0];
			for (j = 1;j < m;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[i][j] == max)
				{
					for (t = 0;t < n;t++)
					{
						if (a[t][j] < a[i][j])
						{
							break;
						}
					}
						if (t == n)
						{
							System.out.printf("%d+%d",i,j);
							break;
						}
				}
			}
			if (t == n)
			{
				break;
			}
		}
		if (i == n)
		{
			System.out.print("No");
		}
	}

}

