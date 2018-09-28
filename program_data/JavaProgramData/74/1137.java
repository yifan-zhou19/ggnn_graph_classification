package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
		int m = 0;
		while (n != 0)
		{
			m = m * 10 + n % 10;
			n = n / 10;
		}
		return (m);
	}
	public static int sushu(int n)
	{
		int i;
		if (n % 2 == 0 && n > 2)
		{
			return (0);
		}
		else if (n == 2)
		{
			return (1);
		}
		else
		{
			for (i = 3;i <= Math.sqrt(n);i += 2)
			{
				if (n % i == 0)
				{
					break;
				}
			}
			if (i <= Math.sqrt(n))
			{
				return (0);
			}
			else
			{
				return (1);
			}
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int k;
		int a = 0;
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
		for (k = m;k <= n;k++)
		{
			if (k == huiwen(k) && sushu(k) == 1)
			{
				if (a == 0)
				{
					System.out.printf("%d",k);
					a++;
				}
				else
				{
					System.out.printf(",%d",k);
				}
			}
		}
		if (a == 0)
		{
			System.out.print("no");
		}
	}
}

