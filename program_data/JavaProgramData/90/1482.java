package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int apple(int m,int n)
	{
		sum = 0;
		if (m == 0 && n > 0)
		{
		return 1;
		}
		if (m == 1 && n > 0)
		{
		return 1;
		}
		if (m > 0 && n == 1)
		{
		return 1;
		}
		if (m < 0)
		{
		return 0;
		}
		sum = apple(m, n - 1) + apple(m - n, n);
		return sum;
	}
	public static int Main()
	{
		int q;
		int t;
		int i;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{

			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(m, n));
			System.out.print("\n");
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

