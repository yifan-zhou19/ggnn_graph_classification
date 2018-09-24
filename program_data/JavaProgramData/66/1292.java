package <missing>;

public class GlobalMembers
{
	public static int leap(int x)
	{
		if (x % 4 != 0)
		{
			return 0;
		}
		else if (x % 100 == 0 && x % 400 != 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main()
	{
		int leap = int x;
		int y;
		int m;
		int d;
		int p = 0;
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
		int i;
		int sumy = 0;
		int summ = 0;
		for (i = 1;i <= (y - 1) % 400;i++)
		{
			if (leap(i) == 0)
			{
				sumy = (sumy + 365) % 7;
			}
			else if (leap(i) == 1)
			{
				sumy = (sumy + 366) % 7;
			}
		}
		int[] b1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (leap(y) == 0)
		{
			for (i = 0;i < m - 1;i++)
			{
				summ = (summ + b1[i]) % 7;
			}
		}
		else if (leap(y) == 1)
		{
			for (i = 0;i < m - 1;i++)
			{
			summ = (summ + b2[i]) % 7;
			}
		}
		int re = sumy + summ + d;
		p = re % 7;

		switch (p)
		{
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
			break;
		}
	}

}

