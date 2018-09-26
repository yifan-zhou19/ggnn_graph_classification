package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int c;
		int i;
		int j;
		int r;
		int d;
		int e;
		int min;
		int max;
		int[] b = new int[8];
		int[][] a = new int[8][8];
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
			max = a[i][0];
			b[i] = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					b[i] = j;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			min = a[i][b[i]];
			c = 1;
			for (r = 0;r < m;r++)
			{
				if (a[r][b[i]] < min)
				{
					c = 0;
					break;
				}
			}
			if (c == 1)
			{
				d = i;
				e = b[i];
				break;
			}
		}
		if (c == 1)
		{
			System.out.printf("%d+%d",d,e);
		}
		else if (c == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

