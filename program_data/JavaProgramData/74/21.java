package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int s;
		int u = 0;
		int r1;
		int r2;
		int k;
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
		for (i = n;i <= m;i++)
		{
			if (i % 2 == 1)
			{
				for (j = 3;j <= Math.sqrt(i);j += 2)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(i))
				{
					r1 = i;
					r2 = 0;
					for (;;)
					{
						if (r1 > 0)
						{
							r2 = r2 * 10 + r1 % 10;
						r1 = r1 / 10;
						}
						else
						{
							if (i == r2)
							{
							if (u == 0)
							{
								System.out.printf("%d",i);
							}
							else
							{
								System.out.printf(",%d",i);
							}
							++u;
							}
							break;
						}
					}
				}
			}
		}
		if (u == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}


}

