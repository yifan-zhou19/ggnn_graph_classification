package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int g;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (a = 3; a <= n / 2; a += 2)
		{
			k = 0;
			g = 0;
			for (int i = 3; i <= a; i += 2)
			{
				if (a % i != 0)
				{
					continue;
				}
				else
				{
					k++;
				}
			}
			b = n - a;
			for (int i = 3; i <= b; i += 2)
			{
				if (b % i != 0)
				{
					continue;
				}
				else
				{
					g++;
				}
			}
			if (k == 1 && g == 1)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

