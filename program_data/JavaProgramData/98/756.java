package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[1000][41];
	public static int n;

	public static void y(int b)
	{
		int i;
		int x = 0;
		for (i = b;;i++)
		{
			x = x + String.valueOf(a[i]).length();
			if (x == 80)
			{
				System.out.print(a[i]);
				System.out.print("\n");
				if (i == n - 1)
				{
					break;
				}
				y(i + 1);
			}
			if (x + 1 <= 80)
			{
				if (x + 1 + String.valueOf(a[i + 1]).length() <= 80)
				{
					if (i < n - 1)
					{
						x = x + 1;
						System.out.print(a[i]);
						System.out.print(" ");
						continue;
					}
					if (i == n - 1)
					{
						System.out.print(a[i]);
						System.out.print("\n");
						System.exit(1);
					}
				}
				if (x + 1 + String.valueOf(a[i + 1]).length() > 80)
				{
					System.out.print(a[i]);
					System.out.print("\n");
					if (i == n - 1)
					{
						break;
					}
					y(i + 1);
				}
			}
		}
	}

	public static int Main()
	{
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 0;p < n;p++)
		{
			a[p] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		y(0);
		return 0;
	}

}

