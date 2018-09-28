package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int tianshucha = new int(int m, int y1,int r1,int y2,int r2);
		int n;
		int[] m = new int[200];
		int[] y1 = new int[200];
		int[] y2 = new int[200];
		int i;
		int d;
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
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			d = tianshucha(m[i], y1[i], 1, y2[i], 1);
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}


	}


	public static int tianshucha(int m,int y1,int r1,int y2,int r2)
	{
		int d1;
		int d2;
		int d;
		int i;
		d1 = r1;
		d2 = r2;
		for (i = 1;i < y1;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				d1 = d1 + 31;
			}
			else
			{
				if (i == 2)
				{
					d1 = d1 + 28;
				}
				else
				{
					d1 = d1 + 30;
				}
			}
		}
		for (i = 1;i < y2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				d2 = d2 + 31;
			}
			else
			{
				if (i == 2)
				{
					d2 = d2 + 28;
				}
				else
				{
					d2 = d2 + 30;
				}
			}
		}
		if (d1 > d2)
		{
			d = d1 - d2;
		}
		else
		{
			d = d2 - d1;
		}
		if (((m % 4 == 0) && (m % 100 != 0)) || (m % 400 == 0))
		{
			if ((y1 <= 2 && y2 <= 2) || (y1>2 && y2>2))
			{
				return d;
			}
			else
			{
				return d + 1;
			}
		}
		return d;

	}
}

