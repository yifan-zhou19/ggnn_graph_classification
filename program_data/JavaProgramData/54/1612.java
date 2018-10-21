package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int an = 1;
		for (int i = 0; i < n; i++)
		{
			an = an * n;
		}
		an = an - k * (n - 1);
		System.out.print(an);
		return 0;
	}

}

