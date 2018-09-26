package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int m;
	public static int first = 1;
	public static int see;
	public static int ok = 0;
	public static void monkey(int i, int j)
	{
		if (i == n)
		{
			System.out.print(n * j + k);
			ok = 1;
			return;
		}
		see = n * j + k;
		if (see % (n - 1) == 0)
		{
			monkey(i + 1, see / (n - 1));
		}
	}
	public static int Main()
	{
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			(monkey(1, i));
			i++;
		}while (ok == 0);
		return 0;
	}
}

