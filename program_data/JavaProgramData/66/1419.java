package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y;
	int m;
	int d;
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
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	{
		days[1] = 29;
	}
	int s = y - 1 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
	int i;
	for (i = 1; i < m; i++)
	{
		s += days[i - 1];
	}
	s += d;
	String[] xq = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
	System.out.printf("%s\n",xq[s % 7 - 1]);
	return 0;
	}
}

