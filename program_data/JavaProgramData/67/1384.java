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
		int[][] a = new int[N][2];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < 2;j++)
		   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
		   }
		}
		double jwj;
		jwj = (double)a[0][1] / a[0][0];
		double[] b = new double[N];
		int k = 0;
		for (i = 1;i < n;i++)
		{
				b[k] = (double)a[i][1] / a[i][0];
			  if (b[k] > 0.05 + jwj)
			  {
				  System.out.print("better\n");
			  }

			 else if (b[k] + 0.05 < jwj)
			 {
			  System.out.print("worse\n");
			 }
					   else
					   {
				   System.out.print("same\n");
					   }
				k++;

		}
		  return 0;
	}

}

