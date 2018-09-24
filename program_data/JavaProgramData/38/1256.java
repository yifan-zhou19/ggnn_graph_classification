package <missing>;

public class GlobalMembers
{
	public static double fangcha(tangible.RefObject<Double> p, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * q;
		double aver = 0;
		double sum = 0;
		double pfhe = 0;
		int i;
		for (q = p.argValue,i = 0;i < n;i++,q++)
		{
			sum = sum + (*q);
		}
		aver = sum / n;
		for (q = p.argValue,i = 0;i < n;i++,q++)
		{
			pfhe = pfhe + Math.pow(aver - (*q),2);
		}
		return Math.sqrt(pfhe / n);
	}
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] x = new double[1100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			int i;
			for (p = x,i = 0;i < n;i++,p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
			p = x;
		tangible.RefObject<Double> tempRef_p = new tangible.RefObject<Double>(p);
			System.out.printf("%.5f\n",fangcha(tempRef_p, n));
			p = tempRef_p.argValue;
		}
		return 0;
	}

}

