package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		int i;
		int i2;
		int day;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			day = 0;
			for (i2 = 0;i2 < i;i2++)
			{
				day = day + a[i2];
			}
			x = (day + 12 + w) % 7;
			if (x == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}

}

