package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[10][10];
		int m;
		int n;
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
		int i;
		int j;
		int k;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{

				int a = sz[i][j];
				int aMax = 1; //true
				// is 'a' max in row
				for (k = 0; k < n; k++)
				{
					if (sz[i][k] > a)
					{
						aMax = 0;
					}
				}

				int aMin = 1;
				// is 'a' min in col
				for (k = 0; k < m; k++)
				{
					if (sz[k][j] < a)
					{
						aMin = 0;
					}
				}

				if (aMax == 1 && aMin == 1)
				{
					System.out.printf("%d+%d\n", i, j);
					return 0;
				}
			}
		}
		System.out.print("No\n");
		return 0;
	}


}

