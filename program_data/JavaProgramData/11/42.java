package <missing>;

public class GlobalMembers
{
	public static int leap(int n)
	{
		int leap = 0;
		if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0)
		{
			leap = 1;
		}
		return (leap);
	}

	public static int Main()
	{
		int year;
		int month;
		int day;
		int th = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (leap(year) == 1)
		{
			a[2] = 29;
		}
		for (int i = 0; i < month; i++)
		{
			th = th + a[i];
		}
		th = th + day;
		System.out.printf("%d", th);
		return (0);
	}
}

