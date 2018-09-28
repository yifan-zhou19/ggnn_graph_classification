package <missing>;

public class GlobalMembers
{
	public static int huiwen(int m)
	{
		int n = 0;
		int s;
		int a;
		a = m;
		for (;m > 0;)
		{
			s = m % 10;
			m = m / 10;
			n = n * 10 + s;
		}
		if (n == a)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int sushu(int m)
	{
		int i;
		if (m % 2 == 0)
		{
			return (0);
		}
		else
		{
			for (i = 3;i < m / 2 && m % i != 0;i = i + 2)
			{
				;
			}
			if (m % i != 0)
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int o = 0;
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
		for (;m <= n;m++)
		{
			if (huiwen(m) != 0 && sushu(m) != 0)
			{
				if (o != 0)
				{
				 System.out.print(",");

				}
						o++;
			System.out.printf("%d",m);
			}
		}
			if (o == 0)
			{
				System.out.print("no");
			}

	}

}

