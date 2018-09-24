package <missing>;

public class GlobalMembers
{
	public static void dayprint(int a)
	{
		switch (a)
		{
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
		case 7:
			System.out.print("Sun.");
			break;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int a;
		int sum;
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		sum = y % 7 + y / 4 - y / 100 + y / 400;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			days[1] = 29;
			sum--;
		}

		for (i = 1;i < m;i++)
		{
			sum += days[i - 1];
		}
		sum += d - 1;
		if (sum % 7 == 0)
		{
			a = 7;
		}
		else
		{
			a = sum % 7;
		}
		dayprint(a);
		return 0;
	}

}

