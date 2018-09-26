package <missing>;

public class GlobalMembers
{
	public static int f(int i, int j)
	{
		int k;
		k = i + j;
		return k;
	}

	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (b = 1; b <= n; b++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				i = 1;
				j = 1;
				for (c = 2; c < a; c++)
				{
					k = f(i, j);
					i = j;
					j = k;
				}
				System.out.print(j);
				System.out.print("\n");
			}
		}
			return 0;
	}
}

