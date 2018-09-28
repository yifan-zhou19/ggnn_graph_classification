package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[102];
		double h;
		double pfh;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		int k;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			p = a;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p++ = Double.parseDouble(tempVar3);
				}
			}
			p = a;
			h = 0;
			pfh = 0;
			for (i = 0;i < n;i++)
			{
				pfh = pfh + Math.pow(*p,2);
				h = h + *p;
				p++;
			}
			System.out.printf("%.5lf\n",Math.sqrt(pfh / n - Math.pow(h / n,2)));
		}
	}

}

