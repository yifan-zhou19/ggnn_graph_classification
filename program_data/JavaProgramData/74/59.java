package <missing>;

public class GlobalMembers
{
	public static int su(int x)
	{
		int i;
		int b = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
			b = 0;
			break;
			}
		}
		return (b);
	}
	public static int hw(int x)
	{
		int n;
		int s = 0;
		n = x;
		while (n > 0)
		{
			s = s * 10 + n % 10;
			n = n / 10;
		}
		if (s == x)
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
		int b = 0;
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
			if (su(i) != 0)
			{
				if (hw(i) != 0)
				{
					if (b == 0)
					{
					System.out.printf("%d",i);
					b = 1;
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
		if (b == 0)
		{
			System.out.print("no");
		}
	}
}

