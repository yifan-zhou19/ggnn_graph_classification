package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int[] a = new int[12];
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[0] = 0;
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = 31;
		a[2] = 28,a[4] = a[6] = a[9] = a[11] = 30;
		for (j = 1;j <= 12;j++)
		{
			day = 0;
			for (i = 0;i < j;i++)
			{
				day = day + a[i];
			}
			if (((day + 12) + w) % 7 == 5)
			{
				System.out.printf("%d\n",j);
			}
		}
		return 0;
	}
}

