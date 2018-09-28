package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[N];
		int i;
		float sum_a = 0F;
		float sum_b = 0F;
		float sum_c = 0F;
		float sum_d = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] <= 18)
			{
			   sum_a++;
			}
			   else if (sz[i] <= 35)
			   {
				  sum_b++;
			   }
				  else if (sz[i] <= 60)
				  {
					   sum_c++;
				  }
					   else
					   {
					   sum_d++;
					   }
		}
		sum_a = (float)100.00 * sum_a / n;
		sum_b = (float)100.00 * sum_b / n;
		sum_c = (float)100.00 * sum_c / n;
		sum_d = (float)100.00 * sum_d / n;
		System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%",sum_a,sum_b,sum_c,sum_d);
		return 0;
	}
}

