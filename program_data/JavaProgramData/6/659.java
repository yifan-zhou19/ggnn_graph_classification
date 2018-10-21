package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int o = 0;
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int num = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (o = 0;o < k;o++)
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
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						num = Integer.parseInt(tempVar4);
					}
					if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					{
						sum = sum + num;
					}
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}



}

