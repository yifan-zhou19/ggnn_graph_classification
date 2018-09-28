package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] sz = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double sum;
		double average;
		double total;
		double s;
		int k;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] p = sz;
			sum = 0.0;
			total = 0.0;
			for (p = sz;p < sz + n;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				sum = sum + p[0];
			}
			average = sum / (1.0 * n);
			for (p = sz;p < sz + n;p++)
			{
				total = total + (p[0] - average) * (p[0] - average);
			}
			s = Math.sqrt(total / (1.0 * n));
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}


}

