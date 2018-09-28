package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double b1;
		double b2;
		double b3;
		double b4;
		int sum1;
		int sum2;
		int sum3;
		int sum4;
		sum1 = sum2 = sum3 = sum4 = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] <= 18)
			{
			  sum1++;
			}
		   else if (sz[i] >= 19 && sz[i] <= 35)
		   {
				   sum2++;
		   }
		   else if (sz[i] >= 36 && sz[i] <= 60)
		   {
				   sum3++;
		   }
		   else if (sz[i] > 60)
		   {
				   sum4++;
		   }
		}

		  b1 = (double)100 * sum1 / n;
		  b2 = (double)100 * sum2 / n;
		  b3 = (double)100 * sum3 / n;
		  b4 = (double)100 * sum4 / n;

	 System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n",b1,b2);
	System.out.printf("36-60: %.2lf%%\n60??: %.2lf%%\n",b3,b4);
	return 0;
	}


}

