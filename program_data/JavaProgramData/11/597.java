package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int sum = 0;
		int i;
		int h;
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
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			days[1] = 29;
		}
		else
		{
			days[1] = 28;
		}
		for (i = 0;i < m - 1;i++)
		{
			sum = sum + days[i];
		}
		h = sum + d;
		System.out.printf("%d",h);
	}
}

