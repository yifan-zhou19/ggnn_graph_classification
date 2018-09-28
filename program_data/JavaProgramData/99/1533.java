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
		float[] sz = new float[100];
		float[] s = new float[4];
		s[0] = 0F;
		s[1] = 0F;
		s[2] = 0F;
		s[3] = 0F;
		for (int t = 0;t < n;t++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[t] = Float.parseFloat(tempVar2);
		   }
		   if (sz[t] <= 18F)
		   {
		   s[0] += 1;
		   }
		   else if (sz[t] > 18F && sz[t] <= 35F)
		   {
		   s[1] += 1;
		   }
		   else if (sz[t] > 35F && sz[t] <= 60F)
		   {
		   s[2] += 1;
		   }
		   else
		   {
		   s[3] += 1;
		   }
		}
		s[0] = s[0] * 100.00 / n;
		s[1] = s[1] * 100.00 / n;
		s[2] = s[2] * 100.00 / n;
		s[3] = s[3] * 100.00 / n;
		System.out.printf("1-18: %.2lf%%\n",s[0]);
		System.out.printf("19-35: %.2lf%%\n",s[1]);
		System.out.printf("36-60: %.2lf%%\n",s[2]);
		System.out.printf("60??: %.2lf%%\n",s[3]);
		return 0;
	}

}

