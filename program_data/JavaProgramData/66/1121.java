package <missing>;

public class GlobalMembers
{
	public static int week(int y,int m,int d)
	{
	 int w;
	 if ((m == 1) || (m == 2))
	 {
	  y--;
	  m += 12;
	 }
	 w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400 + 1) % 7;
	 return (w);
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		String[] month = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		System.out.printf("%s",month[week(y, m, d)]);
		return 0;
	}

}

