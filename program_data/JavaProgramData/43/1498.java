package <missing>;

public class GlobalMembers
{
	public static int work(int n)
	{
		for (int i = 3;i <= Math.sqrt(n);i += 2)
		{
		if (n % i == 0)
		{
			return 0;
		}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i += 2)
		{
			if (work(i) != 0 && work(m - i) != 0)
			{
			System.out.print(i);
			System.out.print(' ');
			System.out.print(m - i);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

