package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r;
		int c;
		int R;
		int C;
		int mr;
		int mc;
		int max;
		int min;
		int[][] a = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			R = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			C = Integer.parseInt(tempVar2);
		}
			for (r = 0;r < R;r++)
			{
			for (c = 0;c < C;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[r][c] = Integer.parseInt(tempVar3);
				}
			}
			}
		for (r = 0;r < R;r++)
		{
			max = 0;
			min = 100000;
			mc = mr = 0;
			for (c = 0;c < C;c++)
			{
				if (a[r][c] > max)
				{
					max = a[r][c];
					mc = c;
				}
			}
			for (r = 0;r < R;r++)
			{
				if (a[r][mc] < min)
				{
					min = a[r][mc];
					mr = r;
				}
			}
			if (max == min)
			{
				System.out.printf("%d+%d\n",mr,mc);
				return 0;
			}
		}
		System.out.print("No");
		return 0;
	}


}

