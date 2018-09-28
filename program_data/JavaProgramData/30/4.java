package <missing>;

public class GlobalMembers
{
	public static int nseven(int n)
	{
		if (n % 7 == 0)
		{
			return 0;
		}
		while (n / 10 != 0)
		{
				if (n % 10 == 7)
				{
					return 0;
				}
				n = n / 10;
		}
		if (n % 10 == 7)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (nseven(i) != 0)
			{
				sum += i * i;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}

}

