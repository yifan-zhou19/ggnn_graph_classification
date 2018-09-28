package <missing>;

public class GlobalMembers
{
	public static void jun(int n)
	{
		float[] a;
		int i;
		float sum = 0F;
		double pingfanghe = 0;
		double s;
		a = new float[n];
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Float.parseFloat(tempVar);
			}
			sum += a[i];
		}
		sum = sum / n;
		for (i = 0;i < n;i++)
		{
			pingfanghe += Math.pow((a[i] - sum),2);
		}
		pingfanghe = pingfanghe / n;
		s = Math.sqrt(pingfanghe);
		System.out.printf("%.5lf\n",s);
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			jun(n);
		}
		return 0;
	}

}

