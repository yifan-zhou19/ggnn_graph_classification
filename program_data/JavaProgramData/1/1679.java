package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int judge1(int n)
	{
		int i;
		if (n == 2 || n == 3 || n == 5)
		{
			return 1;
		}
		if (n == 4)
		{
			return 0;
		}
		for (i = 2;i * i < n;i++)
		{
			if (n % i == 0)
			{
				return 0;
				break;
			}
		}
		if (i * i > n)
		{
			return 1;
		}
	}
	public static void divide(int n,int d)
	{
		for (int i = d;i * i <= n;i++)
		{
			if (n % i == 0) //&&judge1(i))
			{
				num++;
				divide(n / i, d);
			}
			d++;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			n--;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 1;
			divide(m, 2);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

