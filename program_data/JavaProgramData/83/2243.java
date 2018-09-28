package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[10];
		int[] cj = new int[10];
		int sum2 = 0;
		int i;
		double[] xfjd = new double[10];
		double sum = 0;
		double jd;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
			if (cj[i] > 89 && cj[i] < 101)
			{
				jd = 4.0;
			}
			if (cj[i] > 84 && cj[i] < 90)
			{
				jd = 3.7;
			}
			if (cj[i] > 81 && cj[i] < 85)
			{
				jd = 3.3;
			}
			if (cj[i] > 77 && cj[i] < 82)
			{
				jd = 3.0;
			}
			if (cj[i] > 74 && cj[i] < 78)
			{
				jd = 2.7;
			}
		   if (cj[i] > 71 && cj[i] < 75)
		   {
			   jd = 2.3;
		   }
			if (cj[i] > 67 && cj[i] < 72)
			{
				jd = 2.0;
			}
			 if (cj[i] > 63 && cj[i] < 68)
			 {
				 jd = 1.5;
			 }
			if (cj[i] > 59 && cj[i] < 64)
			{
				jd = 1.0;
			}
			if (cj[i] < 60)
			{
				jd = 0;
			}
			xfjd[i] = jd * xf[i];
		}
		for (i = 0;i < n;i++)
		{
			sum += xfjd[i];
			sum2 += xf[i];
		}
		System.out.printf("%.2f",(float)sum / sum2);
		return 0;
	}

}

