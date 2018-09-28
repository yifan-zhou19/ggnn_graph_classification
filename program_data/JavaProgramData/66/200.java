package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int r;
		int p;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
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
		r = ((y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400) % 7;
		p = (y - 1 - r) % 7;
		sum1 = r * 366 + p * 365;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			for (i = 0;i < m - 1;i++)
			{
		sum2 = sum2 + b[i];
			}
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
		sum2 = sum2 + a[i];
			}
		}
		sum3 = sum1 + sum2 + d;

		if (sum3 % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (sum3 % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (sum3 % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (sum3 % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (sum3 % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (sum3 % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (sum3 % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

