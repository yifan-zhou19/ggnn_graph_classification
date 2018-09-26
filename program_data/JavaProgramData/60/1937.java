package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int i;
		for (i = 2;i <= a / 2;i++)
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
		int i;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			if (prime(i) == 0 && prime(i + 2) == 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				a++;
			}
		}
		if (a == 0)
		{
			System.out.print("empty");
		}
	}
}

