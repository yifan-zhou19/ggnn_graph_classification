package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};
		int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};
		int y;
		int i;
		int j;
		int sum = 0;
		int m;
		int d;
		String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun"};
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
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			for (i = 0;i < m - 1;i++)
			{
				sum += m2[i];
			}
			sum += d - 1;
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				sum += m1[i];
			}
			sum += d - 1;
		}
	y = y - 1;
		sum = sum + y + y / 4 - y / 100 + y / 400;
		j = sum % 7;
		System.out.printf("%s\n",week[j]);
	return 0;
	}



}

