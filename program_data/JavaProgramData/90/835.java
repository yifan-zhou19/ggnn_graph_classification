package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int distribution = new int(int,int);
		int t;
		int i;
		int[] m = new int[21];
		int[] n = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= t;i++)
		{
			System.out.printf("%d\n",distribution(m[i], n[i]));
		}
		return 0;
	}
			public static int distribution(int m,int n)
			{
				if (m == 1)
				{
					return (1);
				}
				else if (n == 1)
				{
					return (1);
				}
				else if (m < n)
				{
					return (distribution(m, n - 1));
				}
					else
					{
						return (distribution(m - n, n) + distribution(m, n - 1));
					}
			}

}

