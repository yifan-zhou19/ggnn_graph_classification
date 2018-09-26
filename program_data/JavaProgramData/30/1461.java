package <missing>;

public class GlobalMembers
{
	public static int seven(int n)
	{
		int i;
		int s = 0;
		for (i = 1; i <= n; i++)
		{
			if (i % 10 != 7 && i / 10 != 7 && i % 7 != 0)
			{
				s += i * i;
			}
		}
		return s;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(seven(n));
		System.out.print("\n");
		return 0;
	}

}

