package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int q;
		int i;
		int flag = 1;
		q = Math.sqrt(x);
		for (i = 2;i <= q;i++)
		{
			if (x / i * i == x)
			{
				flag = 0;
				break;
			}
		}
		return flag;
	}
	public static int hw(int x)
	{
		int a;
		int b;
		int c = 0;
		a = x;
		b = x;
		while (b / 10 > 0)
		{
			c = c * 10 + b % 10;
			b = b / 10;
		}
		c = c * 10 + b;
		if (c == a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int count = 0;
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
		for (i = m;i <= n;i++)
		{
			if (prime(i) == 1 && hw(i) == 1)
			{
				count++;
				if (count > 1)
				{
					System.out.print(",");
				}
				System.out.printf("%d",i);
			}
		}
		if (count == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.print("\n");
		}
		return 0;
	}
}

