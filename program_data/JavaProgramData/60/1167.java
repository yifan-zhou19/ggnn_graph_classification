package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		for (i = 3;i <= n - 2;i++)
		{
			t = i + 2;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				for (j = 2;j < t;j++)
				{
					if (t % j == 0)
					{
					break;
					}
				}
				if (t == j)
				{
					System.out.printf("%d %d\n",i,t);
				}
			}
		}
		return 0;
	}
}

