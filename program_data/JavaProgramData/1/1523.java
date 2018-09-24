package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int,int);
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, a));
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int m,int k)
	{
		int i;
		int sum = 0;
		if (m == 1)
		{
			sum = 1;
		}
		for (i = m;i > 1;i--)
		{
			if (m % i == 0 && i <= k)
			{
				sum += f(m / i, i);
			}
		}
		return sum;
	}
}

