package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int h = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1; j <= n; j++)
		{
			m = m + j * j;
		}
		for (int i = 1; i <= n; i++)
		{
			if (i % 7 == 0)
			{
				h = h + i * i;
			}
			else if (i % 10 == 7)
			{
				h = h + i * i;
			}
			else if (i / 10 == 7)
			{
				h = h + i * i;
			}
		}

		System.out.print(m - h);
		System.out.print("\n");
		return 0;
	}
}

