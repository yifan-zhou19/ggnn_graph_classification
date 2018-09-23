package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int y;
		int m;
		int d;
		int D;
		int total = 0;

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
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total = total + 31;
			}
			 else if (i == 4 || i == 6 || i == 9 || i == 11)
			 {
				total = total + 30;
			 }
			else
			{
				if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				{
					total = total + 29;
				}
				else
				{
					total = total + 28;
				}
			}
		}
		D = total + d;
		System.out.printf("%d",D);
		return 0;
	}
}

