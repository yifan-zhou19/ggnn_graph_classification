package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double[] a = new double[100];
		double x;
		double s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			p = a;
			s = 0;
			x = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++,p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				x = x + *p;
			}
			p = a;
			x = x / (double)n;
			for (j = 0;j < n;j++,p++)
			{
				s = s + (*p - x) * (*p - x);
			}
			s = s / (double)n;
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}

}

