package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int z;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		a = x / 400;
		b = x % 400;
		c = b / 100;
		d = b % 100;
		e = d / 4;
		f = d % 4;
		g = c * 5 + e * 5 + 365 * (f - 1) + 700;
		switch (y)
		{
			case 1:
				g = g + z;
				break;
			case 2:
				g = g + z + 31;
				break;
			case 3:
				g = g + z + 59;
				break;
			case 4:
				g = g + z + 90;
				break;
			case 5:
				g = g + z + 120;
				break;
			case 6:
				g = g + z + 151;
				break;
			case 7:
				g = g + z + 181;
				break;
			case 8:
				g = g + z + 212;
				break;
			case 9:
				g = g + z + 243;
				break;
			case 10:
				g = g + z + 273;
				break;
			case 11:
				g = g + z + 304;
				break;
			case 12:
				g = g + z + 334;
				break;
		}
		if ((b == 0 && y < 3) || (e != 0 && f == 0 && y < 3))
		{
			g = g - 1;
		}
		h = g % 7;
		switch (h)
		{
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
			case 0:
				System.out.print("Sun.\n");
				break;
		}
	}
}

