package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	int y;
	int m;
	int d;
	int x;
	int x1;
	int x2;
	int x3;
	int q;
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
	x1 = (y - 1) / 4;
	x2 = (y - 1) / 100;
	x3 = (y - 1) / 400;
	x = (y - 1) + a[m] + d + (x1 - x2 + x3);
	if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) && (a[m] > 59))
	{
		x = x + 1;
	}

	q = x % 7;
	switch (q)
	{
	case 1:
	{
		 System.out.print("Mon.");
			 break;
	}
	case 2:
	{
		 System.out.print("Tue.");
			 break;
	}
	case 3:
	{
		 System.out.print("Wed.");
			 break;
	}
	case 4:
	{
		 System.out.print("Thu.");
			 break;
	}
	case 5:
	{
		 System.out.print("Fri.");
			 break;
	}
	case 6:
	{
		 System.out.print("Sat.");
			 break;
	}
	case 0:
	{
		 System.out.print("Sun.");
			 break;
	}



	}



	return 0;
	}
}

