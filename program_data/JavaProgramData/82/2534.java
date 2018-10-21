package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int t = 0;
		int x1;
		int x2;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (x1 >= 90 && x1 <= 140 && x2 >= 60 && x2 <= 90)
			{
				j++;
			}
			else if (j == 0)
			{
				continue;
			}
			else if (j != 0)
			{
				t = t >= j != 0 ? t: j;
				j = 0;
			}
		}

		t = t >= j != 0 ? t : j;

		System.out.print(t);
		System.out.print("\n");

		return 0;
	}

}

