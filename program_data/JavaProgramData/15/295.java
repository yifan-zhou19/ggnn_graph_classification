package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int p;
		int q;
		int s;
		int t;
		int[][] a = new int[100][100];
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
					if (*(*(a + i) + j) == 0)
					{
				x = i;
				y = j;
				break;
					}
				}
		}
		for (p = n - 1;p >= 0;p--)
		{
				for (q = n - 1;q >= 0;q--)
				{
					if (*(*(a + p) + q) == 0)
					{
				s = p;
				t = q;
				break;
					}
				}
		}
			System.out.printf("%d",(x - s - 1) * (t - y - 1));
		return 0;
	}

}

