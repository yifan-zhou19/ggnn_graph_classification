package <missing>;

public class GlobalMembers
{
	/**
	????6
	?  ?????
	?  ??10.26
	?  ??????
	*/

	public static int Main()
	{
		int n;
		int t = 0;
		int hours;
		int p1;
		int p2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		hours = t;

		for (int i = 1;i <= n;i++)
		{
			p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p1 <= 140 && p1 >= 90 && p2 <= 90 && p2 >= 60)
			{
				t++;
			}
			if (p1 > 140 || p1 < 90 || p2 > 90 || p2 < 60)
			{
				t = 0;
				continue;
			}
			if (t >= hours)
			{
				hours = t;
			}
		}
		System.out.print(hours);
		System.out.print("\n");
		return 0;
	}




}

