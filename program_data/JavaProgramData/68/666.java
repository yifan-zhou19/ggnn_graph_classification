package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int n;
		int m;
		int i;
		int j;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= N;n += 2)
		{
			for (m = 3;m < n;m += 2)
			{
				flag = 1;
				for (i = 2;i <= Math.sqrt(m);i++)
				{
					if (m % i == 0)
					{
					flag = 0;
					break;
					}
				}
				if (flag == 1)
				{
					m = n - m;
					for (i = 2;i <= Math.sqrt(m);i++)
					{
						if (m % i == 0)
						{
						flag = 0;
						break;
						}
					}
				}
				else
				{
					continue;
				}
				if (flag == 1)
				{
					System.out.printf("%d=%d+%d\n",n,n - m,m);
					break;
				}
				m = n - m;
			}
		}
	}
}

