package <missing>;

public class GlobalMembers
{
	public static int c = 1;

	public static void fenjie(int a, int k)
	{
		if (a == 1)
		{
			c++;
			return;
		}
		for (int i = k; i <= a; i++)
		{
			if (a % i == 0)
			{
				fenjie(a / i, i);
			}
		}
	}

	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			c = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			fenjie(a, 2);
			System.out.print(c);
			System.out.print("\n");
		}
		return 0;
	}

}

