package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int t = 0;
		int leap = int y;
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
		switch (m)
		{
		case 12:
			t += 30;
		case 11:
			t += 31;
		case 10:
			t += 30;
		case 9:
			t += 31;
		case 8:
			t += 31;
		case 7:
			t += 30;
		case 6:
			t += 31;
		case 5:
			t += 30;
		case 4:
			t += 31;
		case 3:
			t += 28;
		case 2:
			t += 31;
		case 1:
			t += 0;
		}
		if (m > 2 && leap(y) != 0)
		{
			t += 1;
		}
		t += d;
		System.out.printf("%d",t);
		return 0;
	}
	public static int leap(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

