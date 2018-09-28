package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		double[] a = new double[100];
		double s;
		double d;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *b;
		double b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
			b = a[0];
			s = 0;
			d = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b + i = Double.parseDouble(tempVar3);
				}
			s = s + *(b + i);
			}
			s = s / n;
			for (i = 0;i < n;i++)
			{
			d = d + (*(b + i) - s) * (*(b + i) - s);
			}
			d = d / n;
			d = Math.sqrt(d);
			System.out.printf("%.5f\n",d);
		}
	}

}

