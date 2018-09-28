package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int s;
	public static int reverse(int num)
	{
		s = 0;
		while (num != 0)
		{
		s = s * 10 + num - ((int)(num / 10)) * 10;
		num = num / 10;
		}
		return s;
	}

	public static int Main()
	{
		int x;
		for (int i = 1;i <= 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x >= 0)
		{
		System.out.printf("%d\n",reverse(x));
		}
		if (x < 0)
		{
			x = (-1) * x;
			System.out.printf("%d\n",(-1) * reverse(x));
		}
		}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

