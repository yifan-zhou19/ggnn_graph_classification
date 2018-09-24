package <missing>;

public class GlobalMembers
{
	public static int fj(int a, int b)
	{
		int j;
		int x;
		int sum = 1;
		int f = 0;
		x = Math.sqrt((double) a);
		if ((a == 1) || (a == 2) || (a == 3))
		{
			return 1;
		}
		else
		{
			for (j = b; j <= x; j++)
			{
				if (a % j == 0)
				{
					sum += fj(a / j, j);
					f = 1;
				}
			}
			if (f == 0)
			{
				return 1;
			}
			else
			{
				return sum;
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fj(a, 2));
			System.out.print("\n");
		}

		return 0;
	}
}

