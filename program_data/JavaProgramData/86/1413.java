package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int s;
		int p;
		int i;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (c = 1;c <= n;c++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 0;i <= m;i++)
			{
				if (m == 0)
				{
					p = 60;
				}
				else if (i == 0 && m != 0)
				{
					continue;
				}
				if (i > 0)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p = Integer.parseInt(tempVar3);
					}
				}
				if (3 * (i - 1) + s < 60 && i < m)
				{
					if (3 * (i - 1) + p <= 60)
					{
						s = p;
					}
					else
					{
						s = 60 - 3 * (i - 1);
					}
				}
				else
				{
					if (3 * (i - 1) + p <= 60 && i == m)
					{
						if (3 * i + p <= 60)
						{
							s = 60 - 3 * i;
						}
						else
						{
							s = 60 - 3 * (i - 1) - (3 - (3 * i + p - 60));
						}
					}
					else
					{
					if (3 * (i - 1) + p > 60 && i == m)
					{
						if (3 * i + s <= 60)
						{
							s = 60 - 3 * (i - 1);
						}
						else
						{
							s = 60 - 3 * (i - 1) - (3 - (3 * i + s - 60));
						}
					}
					}
				}
			}
			System.out.printf("%d",s);
			if (c < n)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}
}

