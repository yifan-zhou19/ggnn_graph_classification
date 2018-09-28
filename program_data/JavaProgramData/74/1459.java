package <missing>;

public class GlobalMembers
{
	public static int run(int n)
	{
		int i = 0;
		int j = 0;
		if (n == 1)
		{
			return -1;
		}
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return -1;
			}
		}
		return 1;
	}
	public static int trans(int n)
	{
		int result = 0;
		while (n >= 1)
		{
			result = result * 10 + n % 10;
			n = n / 10;
		}
		return result;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (run(i) == 1 && trans(i) == i)
			{
				k++;
				if (k == 1)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

