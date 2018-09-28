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
		int[][] sz = new int[100][2];
		double[] a = new double[100];
		double e;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < 2;j++)
						 {
										  String tempVar2 = ConsoleInput.scanfRead();
										  if (tempVar2 != null)
										  {
											  sz[i][j] = Integer.parseInt(tempVar2);
										  }
						 }
						 a[i] = ((1.0 * sz[i][1]) / sz[i][0]) * 100;
		}
		for (i = 1;i < n;i++)
		{
						 if (a[i] > a[0])
						 {
									   e = a[i] - a[0];
									   if (e > 5)
									   {
									   System.out.print("better\n");
									   }
									   else
									   {
										   System.out.print("same\n");
									   }
						 }
						 else if (a[i] < a[0])
						 {
							  e = a[0] - a[i];
							  if (e > 5)
							  {
							  System.out.print("worse\n");
							  }
							  else
							  {
							  System.out.print("same\n");
							  }
						 }
		}

	   return 0;
	}




}

