package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
			if (i % 2 != 0)
			{
				continue;
			}
			else
			{
				for (t = 3;t <= i / 2;t++)
				{
					p = 0;
					q = 0;
					for (m = 2;m <= Math.sqrt(t);m++)
					{
						if (t % m == 0)
						{
							p = 1;
							break;
						}
						else
						{
							continue;
						}
					}
					for (m = 2;m <= Math.sqrt(i - t);m++)
					{
						if ((i - t) % m == 0)
						{
							q = 1;
							break;
						}
						else
						{
							continue;
						}
					}
					if (p == 0 && q == 0)
					{
						System.out.printf("%d=%d+%d\n",i,t,i - t);
						break;
					}
					else
					{
						continue;
					}
				}
			}
		}
		return 0;
	}



}

