package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int k;
		int e;
		int s;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int[][] juzhen = new int[hang][lie];
		for (i = 0;i < h;i++)
		{
			for (k = 0;k < l;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(juzhen[i][k]) = Integer.parseInt(tempVar3);
				}
			}
		}

		for (s = 0;s < l;s++)
		{
			k = s;
			i = 0;
			for (e = 0;e <= s;e++)
			{
				System.out.printf("%d\n",juzhen[i][k]);
				i++;
				k--;
				if (i == h)
				{
					break;
				}
			}
		}
		for (e = 1;e < h;e++)
		{
			i = e;
			k = l - 1;
			for (s = 0;s < (h - e);s++)
			{
				System.out.printf("%d\n",juzhen[i][k]);
				i++;
				k--;
				if (k < 0)
				{
					break;
				}
			}
		}
	return 0;
	}
}

