package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		double t = 0;
		double aver;
		double h;
		double s;
		int i;
		int k;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p1;
		double p1;
		p1 = x;
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
			for (p = p1;p < p1 + n;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
			for (p = p1;p < p1 + n;p++)
			{
				t = t + (*p);
			}
			aver = t / n;
			t = 0;
			for (p = p1;p < p1 + n;p++)
			{
				h = (*p - aver) * (*p - aver);
				t = t + h;
			}
			s = Math.sqrt(t / n);
			System.out.printf("%.5f\n",s);
			t = 0;
			aver = 0;
		}
		return 0;
	}
}

