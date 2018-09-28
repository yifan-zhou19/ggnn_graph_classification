package <missing>;

public class GlobalMembers
{
	public static int SUSHU(int x)
	{
		int d = 2;
		int none = 1;
		int result = 0;
		while (d * d <= x)
		{
			if (x % d == 0)
			{
				none = 0;
				break;
			}
			else
			{
				d += 1;
			}
		}
		if (none == 1)
		{
			result = 1;
		}
		return result;
	}

	public static int Main()
	{
		int m;
		int a = 3;
		int b;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (2 * a <= m)
		{
			b = m - a;
			if ((b % 2 != 0) && (SUSHU(a) == 1) && (SUSHU(b) == 1))
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
			a += 2;
		}
	}
}

