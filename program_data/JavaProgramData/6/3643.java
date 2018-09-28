package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int h1;
		int l1;
		int k;
		int h;
		int l;
		int[][] a = new int[100][100];
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			for (h1 = 1;h1 <= h;h1++)
			{
				for (l1 = 1;l1 <= l;l1++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[h1][l1] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (h1 = 1;h1 <= h;h1++)
			{
				sum[i] += a[h1][1] + a[h1][l];
			}
			for (l1 = 2;l1 <= l - 1;l1++)
			{
				sum[i] += a[1][l1] + a[h][l1];
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

