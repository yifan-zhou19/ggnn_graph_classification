package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int i;
		int b = 0;
		for (i = a;i > 0;i /= 10)
		{
			b = b * 10 + i % 10;
		}
		if (a == b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int prime(int a)
	{
		int i;
		if (a == 1)
		{
			return 0;
		}
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) != 0 && prime(i) != 0)
			{
				if (t != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",i);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
		return 0;
	}

}

