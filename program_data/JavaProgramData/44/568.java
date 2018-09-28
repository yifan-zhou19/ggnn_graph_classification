package <missing>;

public class GlobalMembers
{
	public static int back(int a)
	{
		int b = Math.abs(a);
		int m = 0;
		int r = 0;
		int i = 0;
		if (a < 0)
		{
			a = -a;
			r = 1;
		}
		while (b > 0)
		{
			b /= 10;
			i++;
		}
		while (a > 0)
		{
			i--;
			m = a % 10;
			b += m * Math.pow((double)10,(double)i);
			a /= 10;
		}
		if (r == 1)
		{
			b = -b;
		}
		return b;
	}
	public static int Main()
	{
		int a;
		for (int i = 1;i <= 6;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(back(a));
			System.out.print("\n");
		}
		return 0;
	}
}

