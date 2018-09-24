package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[13];
		int y;
		int m;
		int d;
		int t = 0;
		int w;
		s[1] = s[3] = s[5] = s[7] = s[8] = s[10] = s[12] = 31;
		s[4] = s[6] = s[9] = s[11] = 30;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s[2] = y % 400 == 0 || y % 4 == 0 && y % 100 != 0?29:28;
		for (int i = 1;i < m;++i)
		{
			t += s[i];
		}
		t += d;
		w = ((y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + t) % 7;
		if (w == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		else if (w == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		else if (w == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		else if (w == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		else if (w == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		else if (w == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		else
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
	}
}

