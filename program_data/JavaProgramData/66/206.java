package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total;
		int i;
		int j;
		int a;

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
		a = (y - 1) % 400;
		for (j = 1;j <= a;j++)
		{
			total1 = (total1 + 1) % 7;
			if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
			{
				total1 = total1 + 1;
			}
		}

		int[] mth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < m;i++)
		{
			total2 = total2 + mth[i - 1];
		}
		if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && (m > 2))
		{
			total2 = total2 + 1;
		}
		total3 = d;
		total = total1 + total2 + total3;
		if (total % 7 == 1)
		{
			System.out.print("Mon.\n");
		}
		else if (total % 7 == 2)
		{
			System.out.print("Tue.\n");
		}
		else if (total % 7 == 3)
		{
			System.out.print("Wed.\n");
		}
		else if (total % 7 == 4)
		{
			System.out.print("Thu.\n");
		}
		else if (total % 7 == 5)
		{
			System.out.print("Fri.\n");
		}
		else if (total % 7 == 6)
		{
			System.out.print("Sat.\n");
		}
		else if (total % 7 == 7)
		{
			System.out.print("Sun.\n");
		}

		return 0;
	}


}

