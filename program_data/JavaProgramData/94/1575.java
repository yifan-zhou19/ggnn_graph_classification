package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int e;
		int m = 1;
		int[] xh = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xh[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] ch = new int[5000];
		for (i = 1;i <= N;i++)
		{
			if (xh[i] % 2 == 1)
			{
				ch[m] = xh[i];
				m++;
			}
		}
		for (int k = 1;k <= m - 1;k++)
		{
			for (i = k;i <= m - 1;i++)
			{
				if (ch[i + 1] > ch[k])
				{
					e = ch[k];
					ch[k] = ch[i + 1];
					ch[i + 1] = e;
				}
			}
		}
		for (i = m - 1;i >= 2;i--)
		{
		System.out.printf("%d,",ch[i]);
		}
	System.out.printf("%d",ch[1]);
		return 0;
	}
}

