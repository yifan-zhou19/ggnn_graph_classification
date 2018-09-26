package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double sumjd = 0;
		double avejd;
		int k;
		int sumxf = 0;
		int[] xf = new int[10];
		int[] fs = new int[10];
		double[] jd = new double[10];

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
				(xf[i]) = Integer.parseInt(tempVar2);
			}
		}
		 for (i = 0;i < n;i++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(fs[i]) = Integer.parseInt(tempVar3);
			}
		 }

		 for (k = 0;k < n;k++)
		 {
			 if (fs[k] >= 90)
			 {
			 jd[k] = 4.0;
			 }
			 else if (fs[k] >= 85)
			 {
			 jd[k] = 3.7;
			 }
			 else if (fs[k] >= 85)
			 {
			 jd[k] = 3.7;
			 }
			 else if (fs[k] >= 82)
			 {
			 jd[k] = 3.3;
			 }
			 else if (fs[k] >= 78)
			 {
			 jd[k] = 3.0;
			 }
			 else if (fs[k] >= 75)
			 {
			 jd[k] = 2.7;
			 }
			 else if (fs[k] >= 72)
			 {
			 jd[k] = 2.3;
			 }
			 else if (fs[k] >= 68)
			 {
			 jd[k] = 2.0;
			 }
			 else if (fs[k] >= 64)
			 {
			 jd[k] = 1.5;
			 }
			 else if (fs[k] >= 60)
			 {
			 jd[k] = 1.0;
			 }
			 else
			 {
			 jd[k] = 0;
			 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 sumjd = sumjd + 1.0 * xf[i] * jd[i];
		 }
		 for (i = 0;i < n;i++)
		 {
			 sumxf = sumxf + xf[i];
		 }
		 avejd = 1.0 * sumjd / sumxf;
		 System.out.printf("%.2lf",avejd);
		 return 0;
	}


}

