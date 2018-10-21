package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int next(int a,int b)
	{
		if (a == 1)
		{
			return 1;
		}
		if (a < b)
		{
			return 0;
		}
		int sum = 0;
		for (;b <= a;b = b + 1)
		{
			if (a % b == 0)
			{
				sum = sum + next(a / b, b);
			}
		}

		return sum;
	}
	public static int Main()
	{
		int i;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i = i + 1)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(next(n, 2));
			System.out.print("\n");
		}
		return 0;
	}


}

