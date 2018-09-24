package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int flag;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m >= 6 && m <= 10000)
		{
			for (k = 3;k <= m / 2;k = k + 2)
			{
				flag = 1;
				for (i = 2;i < k;i++)
				{
					if (k % i == 0)
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					a = m - k;
					for (j = 2;j < a;j++)
					{
						if (a % j == 0)
						{
							flag = 0;
							break;
						}
					}
					if (flag == 1)
					{
						System.out.printf("%d %d\n",k,a);
					}
				}
			}
		}
		return 0;
	}
}

