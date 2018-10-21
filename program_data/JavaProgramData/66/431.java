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
	if (m == 1)
	{
	Y = Y - 1;
	m = 13;
	}
	if (m == 2)
	{
	Y = Y - 1;
	m = 14;
	}

	c = Y / 100;
	y = Y - c * 100;
	int a;
	int b;
	int e;
	a = y / 4;
	b = c / 4;
	e = 26 * (m + 1) / 10;

	if (Y <= 5000)
	{
	w = y + a + b - 2 * c + e + d - 1;
	w = w % 7;


	switch (w)
	{
	case 0:
		System.out.print("Sun.\n");
		break;
	case 1:
		System.out.print("Mon.\n");
		break;
	case 2:
		System.out.print("Tue.\n");
		break;
	case 3:
		System.out.print("Wed.\n");
		break;
	case 4:
		System.out.print("Thu.\n");
		break;
	case 5:
		System.out.print("Fri.\n");
		break;
	case 6:
		System.out.print("Sat.\n");
		break;
	}
	}
	else
	{
		w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400 + 1) % 7;

	switch (w)
	{
	case 6:
		System.out.print("Sun.\n");
		break;
	case 0:
		System.out.print("Mon.\n");
		break;
	case 1:
		System.out.print("Tue.\n");
		break;
	case 2:
		System.out.print("Wed.\n");
		break;
	case 3:
		System.out.print("Thu.\n");
		break;
	case 4:
		System.out.print("Fri.\n");
		break;
	case 5:
		System.out.print("Sat.\n");
		break;
	}
	}
	return 0;
	}


}

