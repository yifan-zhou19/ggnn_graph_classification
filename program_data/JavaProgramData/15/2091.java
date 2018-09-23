package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int x;
		int y;
		int f;
		int s;
		int[][] a = new int[100][100];
		x = 0;
		y = 0;
		f = 1;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					sum = sum + 1;
					if (f == 1)
					{
						x = x + 1;
					}
				}
				if ((sum > 0) && (a[i][j] == 255))
				{
					f = 0;
				}
			}
		}
		y = sum / 2 - x;
		x = x - 2;
		s = x * y;
		System.out.printf("%d\n",s);
	}

}

