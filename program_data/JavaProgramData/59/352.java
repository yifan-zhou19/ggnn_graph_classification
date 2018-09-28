package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[200][200];
		char[][] zfc1 = new char[200][200];
		int n;
		int m;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			zfc1[i] = zfc[i];
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		m--;
		while (m != 0)
		{
			for (i = 1;i <= n;i++)
			{
				k = 0;
				if ((zfc[i][1] == '@' || zfc[i - 1][0] == '@' || zfc[i + 1][0] == '@') && zfc[i][0] == '.')
				{
					zfc1[i][0] = '@';
				}
				for (k = 1;k < n;k++)
				{
					if ((zfc[i][k + 1] == '@' || zfc[i][k - 1] == '@' || zfc[i - 1][k] == '@' || zfc[i + 1][k] == '@') && zfc[i][k] == '.')
					{
						zfc1[i][k] = '@';
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				zfc[i] = zfc1[i];
			}
			m--;
		}
		for (i = 1;i <= n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (zfc[i][k] == '@')
				{
					sum++;
				}
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

