package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		d = 0;
		int[] days1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] days2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			for (e = 0;e < b;e++)
			{
				d = d + days1[e];
			}
			d = d + c;
		}
		else
		{
			for (e = 0;e < b;e++)
			{
				d = d + days2[e];
			}
			d = d + c;
		}
		d = d - 1;
		System.out.printf("%d",d);
	}

}

