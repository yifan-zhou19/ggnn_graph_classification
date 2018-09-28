package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int z;
		int a;
		int sum;
		int leap;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sum = 0;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y > z)
			{
				a = y;
				y = z;
				z = a;
			}
			leap = x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
			for (; y < z; y++)
			{
				if (y == 4 || y == 6 || y == 9 || y == 11)
				{
					sum += 30;
				}
				else if (y == 2)
				{
					sum += 28 + leap;
				}
				else
				{
					sum += 31;
				}
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

