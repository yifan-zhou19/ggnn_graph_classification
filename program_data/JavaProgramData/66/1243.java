package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int totalday;
		int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
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
		totalday = y - 1 + (y - 1) / 4 + (y - 1) / 400 - (y - 1) / 100 + a[m - 1] + d;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0 && m > 2)
		{
			totalday++;
		}
		switch (totalday % 7)
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
		return 0;
	}
}

