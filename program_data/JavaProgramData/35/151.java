package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int b = 0;
		int c = 0;
		int d = 0;
		int m;
		int n;
		int i;
		int j;
		int p;
		int max;
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
			for (j = 1;j < n;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					b = j;
				}
			}
			for (p = 0;p < m;p++)
			{
				if (a[i][b] > a[p][b])
				{
					break;
				}
				else
				{
					c++;
				}

			}
			if (c == m)
			{
				d++;
				System.out.printf("%d+%d",i,b);
			}
			b = 0;
			c = 0;
		}
		if (d == 0)
		{
			System.out.print("No");
		}
	}

}

