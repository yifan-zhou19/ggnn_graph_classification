package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int x = 0;
		int hour = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				x = x + 1;
			if (x > hour)
			{
				hour = x;
			}
			}
				 else
				 {
					 x = 0;
				 }
		}
		System.out.print(hour);
		System.out.print("\n");
		return 0;
	}


}

