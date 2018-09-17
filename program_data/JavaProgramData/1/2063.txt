package <missing>;

public class GlobalMembers
{
	public static int shuliang(int m, int n)
	{
		int q;
		int answer = 0;
		int y = 0;
		q = Math.sqrt(n) + 1;
		for (int j = m;j < q;j++)
		{
			if (n % j == 0)
			{
				answer += shuliang(j, n / j),y = 1;
			}
		}
		if (y == 1)
		{
			return answer + 1;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			int x;
			int q;
			int answer = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			q = Math.sqrt(x) + 1;
			for (int j = 2; j < q; j++)
			{
				if (x % j == 0)
				{
					answer += shuliang(j, x / j);
				}

			}
			System.out.printf("%d\n\n",answer);
		}
	}
}

