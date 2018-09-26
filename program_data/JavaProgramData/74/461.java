package <missing>;

public class GlobalMembers
{
	/*??*/
	public static short IsPremium(int n)
	{
		int i;
		if (n == 2)
		{
		return 1;
		}
		if (n % 2 == 0)
		{
		return 0;
		}
		if (n <= 1)
		{
		return 0;
		}
		for (i = 3; i <= Math.sqrt(n); i += 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static short IsHuiWenShu(int n)
	{
		int len = (int)(Math.log(n) / Math.log(10)) + 1;
		int i;
		for (i = 0; i < len / 2; i++)
		{
			if ((n / (int)Math.pow(10,i) % 10) != (n / (int)Math.pow(10,len - i - 1) % 10))
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
		short flag = 0;
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
		for (; m <= n; m++)
		{
			if (IsPremium(m) != 0 && IsHuiWenShu(m) != 0)
			{
				if (flag != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d", m);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

