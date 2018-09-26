package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int dt;
		int dy;
		int i;
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
		dt = Integer.parseInt(tempVar3);
	}
	y = y % 2800;
	if (y == 0)
	{
		y = 2800;
	}
	dy = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

	int[] a = new int[12];
	a[1] = 31;
	a[2] = 28;
	a[3] = 31;
	a[4] = 30;
	a[5] = 31;
	a[6] = 30;
	a[7] = 31;
	a[8] = 31;
	a[9] = 30;
	a[10] = 31;
	a[11] = 30;
	for (i = 1;i < m;i++)
	{
		dy += a[i];
	}
	if ((y % 4 == 0 && y % 100 != 0 && m > 2) || (y % 400 == 0 && m > 2))
	{
		dy++;
	}
	dy += dt;
	dy = dy % 7;
	switch (dy)
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

