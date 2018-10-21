package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int n = 0;
		int k;
		int i;
		int x;
		int[] a = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		if ((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0))
		{
			a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		y = (y - 1) % 400 + 1;

		n = ((y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400) * 2 + (y - 1 - ((y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400));

		for (i = 1;i < m;i++)
		{
			n += a[i];
		}
		n += d;
		k = (n - 1) % 7;
		switch (k)
		{
		case 0:
			System.out.print("Mon.");
			break;
		case 1:
			System.out.print("Tue.");
			break;
		case 2:
			System.out.print("Wed.");
			break;
		case 3:
			System.out.print("Thu.");
			break;
		case 4:
			System.out.print("Fri.");
			break;
		case 5:
			System.out.print("Sat.");
			break;
		case 6:
			System.out.print("Sun.");
			break;
		}
		return 0;
	}
}

