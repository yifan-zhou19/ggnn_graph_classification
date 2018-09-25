package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] w = new int[30];
	int[] f = new int[30];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i] = Integer.parseInt(tempVar2);
			}
		}
		w[0] = 99999;
		f[0] = 0;
		for (i = 1;i <= n;i++)
		{
			f[i] = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (w[j] >= w[i])
				{
					if (f[j] + 1 > f[i])
					{
						f[i] = f[j] + 1;
					}
				}
			}
		}
		int m = 0;
		for (i = 1;i <= n;i++)
		{
			if (f[i] > m)
			{
				m = f[i];
			}
		}
		System.out.printf("%d",m);

		return 0;
	}
}

