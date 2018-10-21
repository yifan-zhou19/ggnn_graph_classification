package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
		double[] p = new double[n];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			p[i] = (double)sz[i][1] / sz[i][0];
		}
		for (i = 1;i < n;i++)
		{
		   if (p[i] - p[0] > 0.05)
		   {
			  System.out.print("better\n");
		   }
		   else if (p[0] - p[i] > 0.05)
		   {
			  System.out.print("worse\n");
		   }
		   else
		   {
			  System.out.print("same\n");
		   }
		}
		return 0;
	}

}

