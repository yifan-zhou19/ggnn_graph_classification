package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int day;
		int tot = 0;
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
			day = Integer.parseInt(tempVar3);
		}
		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
		{
			a[1]++;
		}
		for (i = 0;i < m - 1;i++)
		{
		tot += a[i];
		}
		tot += day;
		System.out.printf("%d\n",tot);
		return 0;
	}
}

