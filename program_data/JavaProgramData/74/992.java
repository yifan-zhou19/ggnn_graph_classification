package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int t = x;
		int r = 0;
		while (t != 0)
		{
			r = 10 * r + t % 10;
			t /= 10;
		}
		if (r == x)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int prime(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
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
			if (reverse(i) != 0 && prime(i) != 0)
			{
				j++;
				printf((j == 1)?"%ld":",%ld",i);
			}
		}
			if (j == 0)
			{
				System.out.print("no");
			}
	}
}

