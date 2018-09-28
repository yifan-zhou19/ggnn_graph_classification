package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double fangcha = new double(double * p,int n,double fc);
		int n;
		int k;
		int i;
		int j;
		double[] a = new double[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double fc = 0;
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
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			p = a;
			if (i != 0)
			{
				System.out.print("\n");
			}
		tangible.RefObject<Double> tempRef_p = new tangible.RefObject<Double>(p);
			System.out.printf("%.5f",fangcha(tempRef_p, k, fc));
			p = tempRef_p.argValue;
		}
		return 0;
	}
	public static double fangcha(tangible.RefObject<Double> p, int n, double fc)
	{
		double aver;
		double sum = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			sum += *(p.argValue + i);
		}
		aver = sum / n;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += (*(p.argValue + i) - aver) * (*(p.argValue + i) - aver);
		}
		fc = Math.sqrt(sum / n);
		return fc;
	}
}

