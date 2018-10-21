package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int g;
	public static int f;
	public static int divide(int chushu,int a)
	{
		int i;
		for (i = chushu;i <= a;i++)
		{
			if (a % i == 0)
			{
				f = a / i;
				if (f > 1)
				{
					g = i;
					divide(g, f);
				}
				else
				{
					sum++;
				}
			}

		}
	return sum;
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int p = 0;
		for (p = 0;p < n;p++)
		{
		   int b = 0;
		   int c = 2;
		   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		System.out.print(divide(c, b));
		System.out.print("\n");
		}

		return 0;
	}
}

