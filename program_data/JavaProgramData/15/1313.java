package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int d1;
		int d2;
		int sum = 0;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 0)
					{
						x1 = i;
						y1 = j;
						break;
					}
				}
				if (j < n)
				{
					break;
				}
			}
			for (i = n - 1;i >= 0;i--)
			{
				for (j = n - 1;j >= 0;j--)
				{
					if (a[i][j] == 0)
					{
						x2 = i;
						y2 = j;
						break;
					}
				}
				if (j >= 0)
				{
					break;
				}
			}
			d1 = x2 - x1 + 1;
			d2 = y2 - y1 + 1;
			sum = (d1 - 2) * (d2 - 2);
			System.out.printf("%d",sum);
	}

}

