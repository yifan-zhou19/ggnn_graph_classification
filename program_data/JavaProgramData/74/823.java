package <missing>;

public class GlobalMembers
{
	public static int isHuiWen(int n)
	{
		int m = n;
		int a = 0;
		while (m != 0)
		{
			a = a * 10 + m % 10;
			m /= 10;
		}
		return (a == n);
	}

	public static int isPrime(int n)
	{
		double max = Math.sqrt((double)n);
		for (int i = 2;i <= max;i++)
		{
			if (n % i == 0)
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
		for (int i = m;i <= n;i++)
		{
			if (isHuiWen(i) != 0 && isPrime(i) != 0)
			{
				if (j != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",i);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

