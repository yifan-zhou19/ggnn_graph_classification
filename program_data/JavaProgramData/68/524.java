package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 6;l <= n;l = l + 2)
		{
			for (m = 3;m <= l / 2;m = m + 2)
			{
				for (i = 3;i <= Math.sqrt(m);i++)
				{
					if (m % i == 0)
					{
						break;
					}
				}
					if (i <= Math.sqrt(m))
					{
						continue;
					}
					for (j = 3;j <= Math.sqrt(l - m);j++)
					{
					if ((l - m) % j == 0)
					{
						break;
					}
					}
					if (j > Math.sqrt(l - m))
					{
						System.out.printf("%d=%d+%d\n",l,m,l - m);
					break;
					}

			}
		}
		return 0;
	}

}

