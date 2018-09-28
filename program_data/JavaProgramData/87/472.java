package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][7];
		int i;
		int sum;
		for (i = 1;i <= 999;i++)
		{
			sum = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][1] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][2] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][3] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][4] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i][5] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[i][6] = Integer.parseInt(tempVar6);
			}
			if (a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0 && a[i][6] == 0)
			{
				break;
			}
			else
			{
				a[i][4] = a[i][4] + 12;
				if (a[i][6] - a[i][3] < 0)
				{
					sum = a[i][6] - a[i][3] + 60;
					a[i][5] = a[i][5] - 1;
				}
				else
				{
					sum = a[i][6] - a[i][3];
				}
				if (a[i][5] - a[i][2] < 0)
				{
					sum = sum + (a[i][5] + 60 - a[i][2]) * 60;
					a[i][4] = a[i][4] - 1;
				}
				else
				{
					sum = sum + (a[i][5] - a[i][2]) * 60;
				}
				sum = sum + (a[i][4] - a[i][1]) * 3600;
				System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}
}

