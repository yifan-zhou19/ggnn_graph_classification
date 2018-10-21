package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N1;
		int N2;
		int Y1;
		int Y2;
		int R1;
		int R2;
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		int x1;
		int x2;
		int[] MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] RUNMONTH = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			Y1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			R1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			N2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			Y2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			R2 = Integer.parseInt(tempVar6);
		}
		x1 = 365 * (N1 - 1);
		x2 = 365 * (N2 - 1);
		for (i = 0;i < N1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				x1 = x1 + 1;
			}
		}
		for (i = 0;i < N2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				x2 = x2 + 1;
			}
		}
		for (i = 1;i < Y1;i++)
		{
			if ((N1 % 4 == 0 && N1 % 100 != 0) || (N1 % 400 == 0))
			{
				x1 = x1 + RUNMONTH[i];
			}
			else
			{
				x1 = x1 + MONTH[i];
			}
		}
		for (i = 1;i < Y2;i++)
		{
			if ((N2 % 4 == 0 && N2 % 100 != 0) || (N2 % 400 == 0))
			{
				x2 = x2 + RUNMONTH[i];
			}
			else
			{
				x2 = x2 + MONTH[i];
			}
		}
		x1 = x1 + R1;
		x2 = x2 + R2;
		k = x2 - x1;
		System.out.printf("%d",k);
	}
}

