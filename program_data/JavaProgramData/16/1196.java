package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(0);
		}
		for (int i = 0; n != 0; i++)
		{
			System.out.print(n % 10);
			n /= 10;
		}
		return 0;
	}

}

