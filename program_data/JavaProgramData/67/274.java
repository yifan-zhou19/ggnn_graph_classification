package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] as = new int[100][2];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				as[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				as[i][1] = Integer.parseInt(tempVar3);
			}
		}
		double x;
		double y;
		x = (double)as[0][1] / (double)as[0][0];
		for (i = 1;i < n;i++)
		{
			y = (double)as[i][1] / (double)as[i][0];
			if (y - x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
	}





}

