package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int num = new int(int,int);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(num(2, a) + 1);
			System.out.print("\n");
		}
		return 0;
	}

	public static int num(int m,int n)
	{
		int i;
		int count = 0;
		int su = int;
		for (i = m;i <= (int)Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				count++;
				if (su(n / i) != 0)
				{
					count += num(i, n / i);
				}
			}
		}
		return count;
	}

	public static int su(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				return 1;
				break;
			}
		}
		if (i == n)
		{
			return 0;
		}
	}
}

