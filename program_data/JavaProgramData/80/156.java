package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int i;
		int sum = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		for (i = sy;i <= ey;i++)
		{
			sum = sum + 365;
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum = sum + 1;
			}
		}
		for (i = 1;i <= sm - 1;i++)
		{
			if (sm != 1)
			{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
			sum = sum - b[i];
			}
			else
			{
				sum = sum - a[i];
			}
			}
		}
		for (i = em;i <= 12;i++)
		{


			if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
			{
			sum = sum - b[i];
			}
			else
			{
				sum = sum - a[i];
			}
		}

		sum = sum + ed - sd;
		System.out.printf("%d",sum);
	}

}

