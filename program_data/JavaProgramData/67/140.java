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
		int[][] sz = new int[1000][2];
		int i;
		double a;
		double b;
		double c;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i][1]) = Integer.parseInt(tempVar3);
			}
		}
		   for (i = 0;i < n;i++)
		   {
			if (i == 0)
			{
					a = 1.0 * sz[i][1] / sz[i][0];
			}
			else
			{
				 b = 1.0 * sz[i][1] / sz[i][0];
				 if (a >= b)
				 {
					 double c = a - b;
					 if (c > 0.05)
					 {
						 System.out.print("worse\n");
					 }
					 else
					 {
						 System.out.print("same\n");
					 }
				 }
				 else
				 {
					 double c = b - a;
					 if (c > 0.05)
					 {
						 System.out.print("better\n");
					 }
					 else
					 {
						 System.out.print("same\n");
					 }
				 }
			}
		   }
		return 0;
	}


}

