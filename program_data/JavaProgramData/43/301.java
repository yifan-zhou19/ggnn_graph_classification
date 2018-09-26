package <missing>;

public class GlobalMembers
{
	public static void gbc(int n)
	{
		int half = n / 2;
		int i;
		int a;
		int b;
		for (i = 3;i <= half;i = i + 2)
		{
			a = ispn(i);
			b = ispn(n - i);
			if (a != 0 && b != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}
	public static int ispn(int p)
	{
		int i;
		int half;
		int isprime;
		isprime = 1;
		if (p % 2 == 0)
		{
			if (p == 2)
			{
				return isprime;
			}
			else
			{
				isprime = 0;
			return isprime;
			}
		}
		half = p / 2;
		for (i = 3;i <= half;i = i + 2)
		{
			if (p % i == 0)
			{
				isprime = 0;
				break;
			}
		}
		return isprime;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		gbc(n);
	return 0;
	}


}

