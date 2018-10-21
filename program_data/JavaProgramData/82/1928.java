package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				k += 1;
			}
			else
			{
				m = (m > k) ? m : k;
				k = 0;
			}
		}
		m = (m > k) ? m : k;
		System.out.print(m);
		System.out.print("\n");

		return 0;
	}
}

