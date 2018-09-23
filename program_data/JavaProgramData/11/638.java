package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int i;
		int c;
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
		if ((y % 4 == 0) && (y % 100) != 0 || (y % 400 == 0))
		{
			days[2]++;
		}
		c = d;
		for (i = 1;i < m;i++)
		{
			c = c + days[i];
		}
		System.out.printf("%d\n",c);
		return 0;
	}
}

