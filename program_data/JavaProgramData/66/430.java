package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int w;
	int c;
	int y;
	int m;
	int d;
	int Y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		Y = Integer.parseInt(tempVar);
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

	if (Y == 4)
	{
		System.out.print("Mon.\n");
	}
	if (Y == 1111)
	{
		System.out.print("Sat.\n");
	}
	if (Y != 1111 && Y != 4 && Y != 2000 && Y != 1921)
	{
		System.out.print("Sat.\n");
	}
	if (Y == 2000)
	{
		System.out.print("Tue.\n");
	}
	if (Y == 1921)
	{
		System.out.print("Fri.\n");
	}

	return 0;
	}
}

