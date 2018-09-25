package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return (0);
				break;
			}
		}
		if (i > Math.sqrt(n))
		{
			return (1);
		}
	}
	public static int huiwen(int n)
	{
		int s = 0;
		int k;
		k = n;
		while (n > 0)
		{
			s = s * 10 + n % 10;
			n = n / 10;
		}
		if (k == s)
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
		int k;
		int s = 0;
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
				s = s + 1;
			}
		}
		if (s == 0)
		{
			System.out.print("no\n");
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf("%d",i);
				k = i;

				break;
			}
		}
		for (j = k + 1;j <= n;j++)
		{
			if (sushu(j) != 0 && huiwen(j) != 0)
			{
				System.out.printf(",%d",j);

			}
		}
		System.out.print("\n");


	}
}

