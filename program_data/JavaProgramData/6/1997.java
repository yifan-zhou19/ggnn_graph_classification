package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int n;
		int m;
		int t;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (l = 1;l <= t;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			int sum = 0;
			int a;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= m;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a = Integer.parseInt(tempVar4);
					}
					if (i == 1 || j == 1 || i == n || j == m)
					{
						sum += a;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

