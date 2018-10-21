package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int t = 0;
		int i;
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
		if (m == 1)
		{
			t += d;
		}
		else if (m == 2)
		{
			t += 31 + d;
		}
		else if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{

			for (i = 1;i < m;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
					t = t + 31;
				}
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					t = t + 30;
				}
				if (i == 2)
				{
					t += 29;
				}
			}
			t = t + d;
		}
		else
		{
			for (i = 1;i < m;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
					t = t + 31;
				}
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					t = t + 30;
				}
				if (i == 2)
				{
					t += 28;
				}
			}
			t = t + d;
		}
		System.out.printf("%d",t);
		return 0;
	}







}

