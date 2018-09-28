package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		if (k < 5)
		{
			System.out.print("empty");
		}
		else if (k < 7)
		{
			System.out.print("3 5\n");
		}
		else
		{
			System.out.print("3 5\n");
			for (m = 5;m <= k;m++)
			{
				flag = 0;
				for (i = 2;i * i <= m;i++)
				{
					if (m % i == 0)
					{
						flag = 1;
						break;
					}
				}
				if (flag == 1)
				{
					continue;
				}
				n = m + 2;
				for (i = 2;i * i <= n;i++)
				{
					if (n % i == 0)
					{
						flag = 1;
						break;
					}
				}
			if (flag == 0)
			{
				System.out.printf("%d %d\n",m,n);
			}
			}
		}
		return 0;
	}

}

