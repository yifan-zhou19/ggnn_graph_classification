package <missing>;

public class GlobalMembers
{
	public static int devide(int n,int m)
	{
		if (n < m)
		{
			m = n;
		}
		if (n == 1) //?????1?,??1
		{
			return 1;
		}
		int sum = 0;
		for (int i = m;i >= 2;i--)
		{
			if (n % i == 0)
			{
				sum = sum + devide(n / i, i);
			}

		}
		return sum;
	}

	public static int Main()
	{
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (i < n)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(devide(m, m));
			System.out.print("\n");
			i++;
		}
		return 0;

	}
}

