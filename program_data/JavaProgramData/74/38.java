package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int t = 0;
		if (x % 2 != 0)
		{
			for (i = 3;i <= Math.sqrt(x);i = i + 2)
			{
				if (x % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(x))
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			return (0);
		}
	}
	public static int huiwen(int x)
	{
		int n = 0;
		int m = x;
		while (m != 0)
		{
			n = n * 10 + m % 10;
			m = m / 10;
		}
		if (n == x)
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
			if (sushu(i) != 0 && huiwen(i) != 0 && t == 0)
			{
				System.out.printf("%d",i);
				t = 1;
			}
			else if (sushu(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}

}

