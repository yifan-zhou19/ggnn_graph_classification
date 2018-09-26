package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[60][60];
		int[] b = new int[60];
		int i;
		int j;
		int[] c = new int[60];
		int[] d = new int[600];
		int[] e = new int[600];
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
				b[i] = Integer.parseInt(tempVar2);
			}
			c[i] = 0;
			e[i] = 0;
			for (j = 0;j < b[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] + 3 * j < 58)
				{
					c[i]++;
				}
				if (a[i][j] + 3 * j < 61 && a[i][j] + 3 * j>57)
				{
					e[i] = 60 - a[i][j] - 3 * j;
				}

			}
			d[i] = 60 - 3 * c[i] - e[i];
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",d[i]);
		}

		return 0;
	}



}

