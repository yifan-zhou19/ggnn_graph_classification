package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int m;
		int z = 1;
		m = (int)Math.sqrt(x);
		for (i = 2;i <= m;i++)
		{
			if (x % i == 0)
			{
				z = 0;
			}
		}
		return z;
	}

	public static int huiwen(int x)
	{
		int a = 0;
		int m;
		int z = 0;
		for (m = x;m != 0;)
		{
			a = a * 10 + m % 10;
			m = m / 10;
		}
		if (a == x)
		{
			z = 1;
		}
		return z;
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
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
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				if (j != 0)
				{
					System.out.print(",");
				}
				j = 1;
				System.out.printf("%d",i);
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

