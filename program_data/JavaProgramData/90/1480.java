package <missing>;

public class GlobalMembers
{
	public static int putapple(int applenum, int platenum)
	{

		if (applenum < 0 || platenum == 0)
		{
			return 0;
		}
		if (applenum == 0 || applenum == 1 || platenum == 1)
		{
			return 1;
		}
		else
		{
			return putapple(applenum, platenum - 1) + putapple(applenum - platenum, platenum);
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(putapple(m, n));
			System.out.print("\n");
		}
			return 0;
	}


}

