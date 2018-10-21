package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int i = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
		for (i = 2;i <= n;i++)
		{
			   s = (s + m) % i;
		}
		System.out.print(s + 1);
		System.out.print("\n");
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s = 0;
		}
	}
}

