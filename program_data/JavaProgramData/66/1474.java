package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int d;
		int cnt = 0;
		int cntpingnian = 0;
		int cntyiqian = 0;
		int cntrunnian = 0;
		int cntthisyear = 0;
		int i;
		int[] a1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
		int[] a2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cntrunnian = (n - 1) / 4 - (n - 1) / 100 + (n - 1) / 400;
		cntpingnian = n - 1 - cntrunnian;
		cntyiqian = cntpingnian + 2 * cntrunnian;
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
			for (i = 0;i < m - 1;i++)
			{
				cntthisyear += a2[i];
			}
			cntthisyear += d;
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				cntthisyear += a1[i];
			}
			cntthisyear += d;
		}
		cnt = cntyiqian + cntthisyear - 1;
		i = cnt % 7;
		switch (i)
		{
			case 0:
				System.out.print("Mon.");
				System.out.print("\n");
				break;
			case 1:
				System.out.print("Tue.");
				System.out.print("\n");
				break;
			case 2:
				System.out.print("Wed.");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("Thu.");
				System.out.print("\n");
				break;
			case 4:
				System.out.print("Fri.");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("Sat.");
				System.out.print("\n");
				break;
			case 6:
				System.out.print("Sun.");
				System.out.print("\n");
				break;
		}


		return 0;
	}
}

