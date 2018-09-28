package <missing>;

public class GlobalMembers
{
	public static int killer(int i)
	{
		int j;
		int k;
		k = (int)Math.sqrt(i);
		for (j = 2;j <= k;j++)
		{
			if (i % j == 0)
			{
				return 0;
				break;
			}
		}
		if (j == k + 1)
		{
			return 1;
		}
	}



	public static void Main()
	{
		int n;
		int r;
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int t;
		t = (int)(n / 2);
		int m = 6;
		for (m = 6;m <= n;m = m + 2)
		{
			for (i = 3;i <= t;i = i + 2)
			{
				r = killer(i);
				if (r == 1)
				{
					s = killer((m - i));
					if (s == 1)
					{
						System.out.printf("%d=%d+%d\n", m,i,m - i);
						break;
					}
					else
					{
						continue;
					}
				}
				else
				{
					continue;
				}
			}
		}
	}
}

