package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int t;
		int x;
		int k;
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
				m = Integer.parseInt(tempVar2);
			}
			k = 60;
			t = 0;
		if (m != 0)
		{
				for (j = 1;j <= m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						x = Integer.parseInt(tempVar3);
					}
						k = k - 3;
						t = t + 3;
					if (x + t >= 60)
					{
						if (x + t <= 65)
						{
							k = x;
							break;
						}
						else
						{
							k = 63 - t;
							break;
						}
					}
				}
		}
		if (i == 1)
		{
			System.out.printf("%d",k);
		}
		else
		{
			System.out.printf("\n%d",k);
		}
		}
	 return 0;
	}
}

