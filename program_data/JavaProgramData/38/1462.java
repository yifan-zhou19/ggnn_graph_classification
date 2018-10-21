package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static double s(double * p, double ave, int k, double[] x)
	{
		double t = 0;
		for (;;)
		{
			t = t + (Math.pow((*p) - ave,2));
			p++;
			if (p == (x + k))
			{
				break;
			}
		}
		return t;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		double[] x = new double[1001];
		double ave;
		double sum;
		double t;
		double r;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		p = x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
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
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (;;)
			{
				sum = sum + (*(p++));
				if (p == (x + k))
				{
					break;
				}
			}
			ave = sum / k;
			p = x;
			t = s(p, ave, k, x);
			r = Math.sqrt(t / k);
			System.out.printf("%.5lf\n",r);
		}
		return 0;
	}
}

