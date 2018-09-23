package <missing>;

public class GlobalMembers
{
	public static int rennian(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int a = 0;
		int b;
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
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (rennian(y) == 1)
		{
			days[2]++;
		}
		for (i = 0;i < m;i++)
		{
			a += days[i];
		}
		b = a + d;
		System.out.printf("%d",b);
		return 0;
	}

}

