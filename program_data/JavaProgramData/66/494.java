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
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d = Integer.parseInt(tempVar3);
	}
	if (3 > m)
	{
	m += 12;
	y--;
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 1)
	{
		System.out.print("Mon.");
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 2)
	{
		System.out.print("Tue.");
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 3)
	{
		System.out.print("Wed.");
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 4)
	{
		System.out.print("Thu.");
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 5)
	{
		System.out.print("Fri.");
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 6)
	{
		System.out.print("Sat.");
	}
	if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 + 1 == 7)
	{
		System.out.print("Sun.");
	}
	return 0;
	}

}

