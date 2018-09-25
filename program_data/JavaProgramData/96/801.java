package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] sz = new int[1000];
		int[] jg = new int[1000];
		String zfc1 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc1 = tempVar.charAt(0);
		}
		m = zfc1.length();
		for (i = 0;i < m;i++)
		{
			 sz[i] = zfc1.charAt(i) - 48;
		}
		if (m >= 2)
		{
			if ((m == 2) && (sz[0] * 10 + sz[1] < 13))
			{
				System.out.printf("%d\n",0);
			}
		for (i = 0;i < m - 1;i++)
		{
			jg[i] = (sz[i] * 10 + sz[i + 1]) / 13;
			sz[i + 1] = (sz[i] * 10 + sz[i + 1]) % 13;
		}
		for (i = 0;i < m - 1;i++)
		{
			if ((i == 0) && (jg[i] == 0))
			{
				continue;
			}
			else if (i != m - 2)
			{
				System.out.printf("%d",jg[i]);
			}
			else if (i == m - 2)
			{
				System.out.printf("%d\n",jg[i]);
			}
		}
		}
		else
		{
			System.out.printf("%d\n",0);
		}
		System.out.printf("%d",sz[m - 1]);
		return 0;
	}


}

