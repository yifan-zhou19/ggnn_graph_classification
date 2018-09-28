package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int i;
		int s;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= k;n = n + 2)
		{
		for (a = 3;a <= n / 2;a++)
		{
			s = Math.sqrt(a);
			for (i = 2;i <= s + 1;i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i > s + 1)
			{
				s = Math.sqrt(n - a);
				for (i = 2;i <= s + 1;i++)
				{
					if ((n - a) % i == 0)
					{
						break;
					}
				}
				if (i > s + 1)
				{
					System.out.printf("%d=%d+%d\n",n,a,n - a);
					break;
				}
			}
		}
		}
	}
}

