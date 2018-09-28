package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int p;
		int s;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			if (i % 7 != 0)
			{
				d = 0;
				for (p = i;p > 0;p = p / 10)
				{
					if ((p - 7) % 10 != 0)
					{
						continue;
					}
					if ((p - 7) % 10 == 0)
					{
					d = 1;
					break;
					}
				}
			if (d != 1)
			{
				s = i * i;
				k += s;
			}
			}
		}
		System.out.printf("%d",k);
		return 0;
	}


}

