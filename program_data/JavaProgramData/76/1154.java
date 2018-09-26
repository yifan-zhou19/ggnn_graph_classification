package <missing>;

public class GlobalMembers
{
	public static int judge(int x,int y,int z)
	{
		if (x >= y != 0 && x <= z)
		{
			return 1;
		}
		return 0;

	}
	public static int Main()
	{



		int max;
		int min;
		int[] start = new int[50000];
		int[] end = new int[500000];
		int all;
		int i;
		int p;
		int ornot;
		max = 0;
		min = 9999;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				start[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
			if (max < end[i])
			{
				max = end[i];
			}
			if (min > start[i])
			{
				min = start[i];
			}
		}
		for (i = 0;i < all;i++)
		{
			ornot = 0;
			for (p = 0;p < all;p++)
			{
				if (i != p && judge(start[i], start[p], end[p]) != 0)
				{
					ornot = 1;
				}
				if (start[i] == min)
				{
					ornot = 1;
				}
			}
			if (ornot == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		for (i = 0;i < all;i++)
		{
			ornot = 0;
			for (p = 0;p < all;p++)
			{
				if (i != p && judge(end[i], start[p], end[p]) != 0)
				{
					ornot = 1;
				}
				if (end[i] == max)
				{
					ornot = 1;
				}
			}
			if (ornot == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",min,max);

	return 0;
	}
}

