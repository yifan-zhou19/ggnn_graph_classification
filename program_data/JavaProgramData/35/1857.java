package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[9][9];
		int h = 0;
		int l = 0;
		int i = 0;
		int j = 0;
		int t = 0;
		int m = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			m = a[i][0];
			t = 0;
			for (j = 0;j < l;j++)
			{
				if (a[i][j] > m)
				{
					m = a[i][j];
					t = j;
				}
			}
			m = a[0][t];
			k = 0;
			for (j = 0;j < h;j++)
			{
				if (a[j][t] < m)
				{
					k = j;
					m = a[j][t];
				}
			}
			if (k == i)
			{
				System.out.printf("%d+%d\n",k,t);
				break;
			}
		}
		if (i >= h)
		{
			System.out.print("No\n");
		}
	}

}

