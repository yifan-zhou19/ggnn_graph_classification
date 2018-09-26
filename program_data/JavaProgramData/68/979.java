package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int k;
		int[] su = new int[50000];
		su[2] = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 3;j < n;j = j + 2)
		{
			int m = 0;
			for (k = 2;k <= Math.sqrt(j);k++)
			{
				if (j % k == 0)
				{
				m++;
				}
			}
			if (m == 0)
			{
				su[j] = j;
			}
			else
			{
				su[j] = 0;
			}
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 0;j < n;j++)
			{
				if (su[j] != 0)
				{
					t = i - su[j];
					if (su[t] != 0 && t > 0)
					{
						System.out.printf("%d=%d+%d\n",i,j,t);
						break;
					}
				}
			}
		}

		return 0;
	}

}

