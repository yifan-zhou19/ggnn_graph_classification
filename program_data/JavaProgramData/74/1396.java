package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		float l = Math.sqrt(n);
		for (i = 2;i <= l;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i <= l)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int huiwen(int n)
	{
		int m = 0;
		int q = 0;
		int k = 0;
		m = n;
		while (m != 0)
		{
			q = m % 10;
			k = k * 10 + q;
			m = m / 10;
		}
		if (n == k)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
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
		i = m;
		while ((sushu(i) == 1 || huiwen(i) == 1) && i <= n)
		{
			i++;
		}
		if (i > n)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",i);
			for (i++;i <= n;i++)
			{
				if (sushu(i) == 0 && huiwen(i) == 0)
				{
					System.out.printf(",%d",i);
				}
			}
		}
	}

}

