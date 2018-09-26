package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	int d;
	int e = 0;
	int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	i = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
		i = a - 1 + (a - 1) / 4 + (a - 1) / 400 - (a - 1) / 100;
	if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0)
	{
	m[2] = 29;
	}
	else
	{
	m[2] = 28;
	}
	for (e = 0;e < b;e++)
	{
		i += m[e];
	}
	i = i + c;
	d = i % 7;
	if (d == 1)
	{
		System.out.print("Mon.\n");
	}
	if (d == 2)
	{
		System.out.print("Tue.\n");
	}
	if (d == 3)
	{
		System.out.print("Wed.\n");
	}
	if (d == 4)
	{
		System.out.print("Thu.\n");
	}
	if (d == 5)
	{
		System.out.print("Fri.\n");
	}
	if (d == 6)
	{
		System.out.print("Sat.\n");
	}
	if (d == 0)
	{
		System.out.print("Sun.\n");
	}
	return 0;
	}

}

