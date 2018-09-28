package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 0;
		int[] a = new int[max];
		int p;
		float[] fz = {2F, 2F};
		float[] fm = {1F, 1F};
		float sum = 2F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < m;i++)
		{
			for (p = 0;p < 2;p++)
			{
			   fz[p] = 2F;
			   fm[p] = 1F;
			}
			sum = 2F;
		   for (p = 2;p <= a[i];p++)
		   {
		   fz[p] = fz[p - 1] + fm[p - 1];
		   fm[p] = fz[p - 1];
		   sum += fz[p] / fm[p];
		   }
	   System.out.printf("%.3f\n",sum);
		}

	return 0;
	}
}

