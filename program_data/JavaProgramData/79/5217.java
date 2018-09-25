package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 0;
		int num = 0;
		int p = 1;
		int[] flag = new int[301];
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				return 0;
			}
			for (;;)
			{
				i++;
				if (p > n)
				{
					p = 1;
				}
				if (flag[p] == 1)
				{
					i--;
					p++;
					continue;
				}
				if (i == m)
				{
					flag[p] = 1;
					i = 0;
					num++;
				}
				p++;
				if (num == n - 1)
				{
					for (i = 1;i <= n;i++)
					{
						if (flag[i] == 0)
						{
							System.out.printf("%d\n",i);
							break;
						}
					}
					break;
				}
			}
			num = 0;
			for (i = 0;i < 301;i++)
			{
				flag[i] = 0;
			}
			i = 0;
			p = 1;
		}
	}
}

