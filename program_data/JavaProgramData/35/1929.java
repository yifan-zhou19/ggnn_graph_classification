package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] z = new int[8][8];
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[8];
		int h;
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
					z[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			h = z[i][0];
	k = 0;
			for (j = 0;j < n;j++)
			{

				if (z[i][j] > h)
				{
										h = z[i][j];
					k = j;
				}

			}
			a[i] = k;
		}
		j = 0;
		for (i = 0;i < m;i++)
		{
			k = 0;
			for (h = 0;h < m;h++)
			{

				if (z[h][a[i]] < z[i][a[i]])
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				System.out.printf("%d+%d",i,a[i]);
				j = 1;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		return 0;

	}
}

