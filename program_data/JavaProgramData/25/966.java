package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m = 1;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			m = m * 2;
		}
		System.out.printf("%f", m);

	}
}

