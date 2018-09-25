package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int dijitian = new int(int,int,int);

		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if ((dijitian(y[j], m1[j], 1) - dijitian(y[j], m2[j], 1)) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
	public static int dijitian(int y,int m,int day)
	{
		int d = 0;
		for (int k = 0;k < m;k++)
		{
			if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10)
			{
				d += 31;
			}
			else if (k == 4 || k == 6 || k == 9 || k == 11)
			{
				d += 30;
			}
			else if (k == 2)
			{
				if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				{
					d += 29;
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
}

