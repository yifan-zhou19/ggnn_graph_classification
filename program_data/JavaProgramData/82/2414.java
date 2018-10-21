package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int t = 0;
		for (int k = 0;k < n;k++)
		{
			int p1;
			int p2;
			p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p1 <= 140 && p1 >= 90 && p2 <= 90 && p2 >= 60)
			{
				t++;
			}
			else
			{
				if (m < t)
				{
					m = t;
				}
				t = 0;
			}
		}
		if (m < t)
		{
			m = t;
		}
		System.out.print(m);
		return 0;
	}
}

