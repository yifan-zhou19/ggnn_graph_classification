package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y;
		int m;
		int d;
		int i;
		int w;
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		w = y % 7 + y / 4 - y / 100 + y / 400;
		for (i = 1;i < m;i++)
		{
			w += days[i];
		}
		w += d - 1;
		if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && (m <= 2))
		{
			w--;
		}
		switch (w % 7)
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

