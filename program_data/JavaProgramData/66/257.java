package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y;
		int m;
		int d;
		int i;
		int x;
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
		x = (y - 1) % 7 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		int[] md = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		for (i = 1;i < m;i++)
		{
			x = x + md[i];
		}
		if ((y % 4 == 0 && y % 100 != 0 || y % 400 == 0) && m > 2)
		{
			x += 1;
		}
		x += d;
		switch (x % 7)
		{
		case 0:
			System.out.print("Sun.");
			break;
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		}

	}


}

