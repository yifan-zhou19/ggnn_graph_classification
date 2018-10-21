package <missing>;

public class GlobalMembers
{
	public static int ss(int a)
	{
		for (int i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
			return 1;
			}
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else
		{
			for (int i = 2;i <= n - 2;i++)
			{
				if (ss(i) == 0 && ss(i + 2) == 0)
				{
				System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
	}
}

