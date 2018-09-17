package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
		int i;
		int count = 0;
		int flag = 0;
		if (m == 1)
		{
			return 1;
		}
		for (i = n; i > 1 ; i--)
		{
			if (m % i == 0)
			{
				count += f(m / i, i);
				flag = 1;
			}
		}
		if (flag != 0)
		{
			return count;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int m;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, m));
			System.out.print("\n");
		}
		return 0;
	}
}

