package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] n = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int y;
		int m;
		int d;
		int i;
		int j;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int count = 0;
		int total = 0;
		int p;
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
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			day[1] = 29;
		}
		p = (y - y % 400) / 400;
		y = y % 400 + 400;
		for (i = 1;i < y;i++)
		{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					count = count + 2;
				}
				else
				{
					count = count + 1;
				}
		}
		for (j = 1;j < m;j++)
		{
			total = total + day[j - 1];
		}
			total = total + d;
			count = count + total % 7;
		count = count % 7;
		if (count == 0)
		{
			count = 7;
		}
		System.out.printf("%s\n",n[count - 1]);
	}
}

