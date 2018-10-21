package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y = 0;
		int m = 0;
		int d = 0;
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
		int days = 0;
		int i;
		if (y % 4 == 0)
		{
			int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 1; i < m; i++)
			{
				days = month[i] + days;
			}
			days = d + days;
		}
		else
		{
			int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 1; i < m; i++)
			{
				days = month[i] + days;
			}
			days = d + days;
		}
		System.out.printf("%d\n", days);
		return 0;
	}
}

