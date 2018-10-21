package <missing>;

public class GlobalMembers
{
	public static int huiwen(int m,int n)
	{

		if (m == 0)
		{
		   return (n);
		}
		else
		{
		   return (huiwen(m / 10, n * 10 + m % 10));
		}
	}
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i > Math.sqrt(n))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		int p = 0;
		for (i = m;i <= n;i++)
		{
			if ((i == huiwen(i, 0)) && sushu(i) != 0)
			{
				if (p == 0)
				{
					System.out.printf("%ld",i);
					p++;
				}
				else
				{
					System.out.printf(",%ld",i);
				}
			}

		}
		if ((i == n + 1) && p == 0)
		{
				System.out.print("no\n");
		}

	}

}

