package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		double[] sz = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
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
				m = Integer.parseInt(tempVar2);
			}
			for (p = sz;p < sz + m;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
			double aver;
			double sum = 0;
			for (p = sz;p < sz + m;p++)
			{
				sum = sum + *p;
			}
			aver = sum / m;
			sum = 0;
			for (p = sz;p < sz + m;p++)
			{
				sum = sum + Math.pow((*p - aver),2);
			}
			double jfc;
			jfc = Math.sqrt(sum / m);
			System.out.printf("%.5lf\n",jfc);
		}
		return 0;
	}

}

