package <missing>;

public class GlobalMembers
{
	public static int function(int n,int a)
	{
		int kind = 0;
		int i;
		if (n == 1)
		{
		return 1;
		}
		for (i = a;i <= n;i++)
		{
			if (n % i == 0)
			{
				if (n / i < i && i != n)
				{
					;
				}
				else
				{
					kind = kind + function(n / i, i);
				}
			}
		}
		return kind;
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int sum;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = function(n, 2);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

