package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[2][3];
		int day = 0;
		int flag = 0;
		int i;
		int j;
		int sum = 0;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0][2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[1][0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a[1][1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			a[1][2] = Integer.parseInt(tempVar6);
		}
		if (a[0][0] - a[1][0] == 0)
		{
			for (j = a[0][1];j < a[1][1];j++)
			{
				if (a[0][0] % 4 == 0 && a[0][0] % 100 != 0 && j == 2 || a[0][0] % 400 == 0 && j == 2)
				{
					day += 29;
				}
				else if (j == 2)
				{
					day += 28;
				}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					day += 31;
				}
				else
				{
					day += 30;
				}
			}
			sum = day - a[0][2] + a[1][2];
		}
		else
		{
			for (i = a[0][0] + 1;i < a[1][0];i++)
			{
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				{
					flag += 1;
				}
			}
			for (j = a[0][1];j <= 12;j++)
			{
				if (a[0][0] % 4 == 0 && a[0][0] % 100 != 0 && j == 2 || a[0][0] % 400 == 0 && j == 2)
				{
					day += 29;
				}
				else if (j == 2)
				{
					day += 28;
				}
				else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					day += 31;
				}
				else
				{
					day += 30;
				}
			}
			sum = day - a[0][2];
			day = 0;
			for (k = 1;k < a[1][1];k++)
			{
				if (a[1][0] % 4 == 0 && a[1][0] % 100 != 0 && k == 2 || a[1][0] % 400 == 0 && k == 2)
				{
					day += 29;
				}
				else if (k == 2)
				{
					day += 28;
				}
				else if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
				{
					day += 31;
				}
				else
				{
					day += 30;
				}
			}
			sum = sum + day + a[1][2];
			sum = sum + 365 * a[1][0] - 365 * a[0][0] - 365 + flag;
		}
		System.out.printf("%d",sum);
		return 0;
	}










}

