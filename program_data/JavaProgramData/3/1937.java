package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int b;
		int c;
		int d;
		int f;
		int m;
		m = 0; //?????
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = b;d > 0;d = d - 1)
		{
			a[d] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (d = 1;d <= b;d++)
		{
			for (f = 1;f <= b;f++)
			{
				if ((a[f] + a[d]) == c && f != d)
				{
					m = 1;
				}
			}

		}
		if (m == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}
}

