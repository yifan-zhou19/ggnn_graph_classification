package <missing>;

public class GlobalMembers
{
	public static int p(int m)
	{
			for (int j = 2;j <= Math.sqrt((float)m);j++)
			{
				if (m % j == 0)
				{
					return 0;
				}
			}
			return 1;
	}
	public static int Main()
	{
		int n;
		int i = 5;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 6;i <= n;i = i + 2)
	{
			int a = 0;
			int b = 0;
			for (a = 2;a <= i - 2;a++)
			{
					if (p(i - a) != 0 && p(a) != 0)
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(a);
						System.out.print("+");
						System.out.print(i - a);
						System.out.print("\n");
					 break;
					}

			}

	}
		return 0;
	}
}

