package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int z;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j <= i;j++)
			{
				if (j == i)
				{
					m = i;
					if (m + 2 > n)
					{
						break;
					}
					for (z = 2;z <= m + 2;z++)
					{
						if (z == m + 2)
						{
							k = m + 2;
							System.out.printf("%d %d\n",m,k);
							x = 1;
						}
						else
						{
							if ((m + 2) % z == 0)
							{
								break;
							}
						}
					}
				}
				else
				{
					if (i % j == 0)
					{
						break;
					}
				}
			}
		}
		if (x == 0)
		{
			System.out.print("empty");
		}
	return 0;
	}

}

