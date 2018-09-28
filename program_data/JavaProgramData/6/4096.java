package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int t;
		int sum;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (t = 0;t < k;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			sum = 0;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						z = Integer.parseInt(tempVar4);
					}
					if (i == 0 || i == m - 1)
					{
						sum += z;
					}
					else
					{
						if (j == 0 || j == n - 1)
						{
							sum += z;
						}
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

