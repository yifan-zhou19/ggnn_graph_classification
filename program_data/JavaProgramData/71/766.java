package <missing>;

public class GlobalMembers
{
	public static int ren(int x)
	{
		if ((x % 400) == 0 || ((x % 100) != 0 && (x % 4) == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int dijitian(int year,int mon,int day)
	{
		int i;
		int d = 0;
		if (ren(year) != 0)
		{
			for (i = 1;i < mon;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					d += 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					d += 30;
				}
				else
				{
					d += 29;
				}
			}
		}
		else
		{
			for (i = 1;i < mon;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					d += 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					d += 30;
				}
				else
				{
					d += 28;
				}
			}
		}
		d += day;

		return d;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] x = new int[210][3];
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x[i][2] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 0;i < n;i++)
		{
			a = dijitian(x[i][0], x[i][1], 1);
			b = dijitian(x[i][0], x[i][2], 1);
			if (a > b)
			{
				if ((a - b) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				if ((b - a) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
		return 0;
	}


}

