package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int[] y1 = new int[10000];
		int[] y2 = new int[10000];
		int n;
		int[] flag = new int[10000];
		double x;
		double[] y = new double[10000];
		double temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x1 = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					x2 = Integer.parseInt(tempVar3);
				}
				x = 100 * (x2) / (x1);
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					y1[i] = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					y2[i] = Integer.parseInt(tempVar5);
				}
				y[i] = 100 * (y2[i]) / (y1[i]);
				temp = y[i] - x;
				if (5 <= temp)
				{
					flag[i] = 2;
				}
				else if (temp <= (-5))
				{
					flag[i] = 0;
				}
				else
				{
					flag[i] = 1;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (flag[i] == 2)
			{
				System.out.print("better\n");
			}
			else if (flag[i] == 1)
			{
				System.out.print("same\n");
			}
			else if (flag[i] == 0)
			{
				System.out.print("worse\n");
			}
		}
		return 0;
	}
}

