package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double[] x = new double[105];
		double a;
		double s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (;k - .0;)
		{
			a = s = 0;
			p = x;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (;p < x + n;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				a += *p;
			}
			a = a / n;
			p = x;
			for (;p < x + n;p++)
			{
				s += (*p - a) * (*p - a);
			}
			s = s / n;
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}
	}

}

