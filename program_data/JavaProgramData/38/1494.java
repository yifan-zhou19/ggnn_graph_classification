package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			double a = 0.0;
			double s = 0.0;
			double[] sz = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			for (j = 0,p = sz;j < n;j++,p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				a += *p;
			}
			a = a / n;
			for (j = 0,p = sz;j < n;j++,p++)
			{
				s += (*p - a) * (*p - a);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

