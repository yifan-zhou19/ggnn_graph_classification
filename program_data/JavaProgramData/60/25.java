package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int ans;
		int test;
		test = 0;
		for (j = 2;j <= n;j++)
		{
			k = Math.sqrt(j);
			for (i = 2;i <= k;i++)
			{
				if (j % i == 0)
				{
					break;
				}
			}
			if (i > k)
			{
				ans = j + 2;
				k = Math.sqrt(ans);
				for (i = 2;i <= k;i++)
				{
					if (ans % i == 0)
					{
						break;
					}
				}
				if (i > k && ans <= n)
				{
					System.out.printf("%d %d\n",j,ans);
					test = 1;
				}
			}
		}
		if (test == 0)
		{
			System.out.print("empty");
		}
	}
}

