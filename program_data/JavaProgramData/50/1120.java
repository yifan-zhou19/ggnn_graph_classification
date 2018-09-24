package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int day;
		int x;
		int y;
		int[] a = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[0] = 31;
		a[2] = 31;
		a[4] = 31;
		a[6] = 31;
		a[7] = 31;
		a[9] = 31;
		a[11] = 31;
		a[1] = 28;
		a[3] = 30;
		a[5] = 30;
		a[8] = 30;
		a[10] = 30;
		for (i = 0;i < 12;i++)
		{
			day = 0;
			for (j = 0;j < i;j++)
			{
				day += a[j];
			}
			day += 12;
			x = day % 7;
			y = x + w;
			if (y % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}
}

