package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int t;
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if ((n == 0) && (m == 0))
		{
			break;
		}
		t = 0;
		int[] nn = new int[300];
		for (i = 1;i < n;i++)
		{
			j = 0;
			for (;;)
			{
				if (t == n)
				{
					for (k = 0;k < n;k++)
					{
						if (nn[k] == 0)
						{
							t = k;
							break;
						}
					}
				}
				if (nn[t] == 0)
				{
					j = j + 1;
				}
				if (j == m)
				{
					break;
				}
				t = t + 1;
			}
			nn[t] = 1;
		}
		for (i = 0;i < n;i++)
		{
			if (nn[i] == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		}
		return 0;
	}
}

