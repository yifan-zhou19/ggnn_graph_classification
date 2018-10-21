package <missing>;

public class GlobalMembers
{
	public static int sum = 1;
	public static int kk(int a,int b)
	{
		int i;
		for (i = b;i >= 2;i--)
		{
			if (a % i == 0)
			{
				return a / i;
			}
		}
			return 0;
	}
	public static int seperate(int a,int b)
	{
		int i;
		for (i = b;i >= 2;i--)
		{
			if (a % i == 0 && (a / i) <= i)
			{
				sum++;
				if ((a / i) == 2)
				{
					continue;
				}
				else
				{
					seperate(a / i, a / i - 1);
				}
			}
			else if ((a % i == 0) && ((kk(a / i, i)) != 0))
			{
				seperate(a / i, i);
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

		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(seperate(m, m - 1));
			System.out.print("\n");
			sum = 1;
		}
		return 0;
	}

}

