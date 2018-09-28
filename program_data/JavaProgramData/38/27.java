package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int l;
		int h;
		double[] a = new double[1000];
		double total = 0;
		double average = 0;
		double s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 0;h < n;h++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				l = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < l;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(p + k) = Double.parseDouble(tempVar3);
				}
				total += *(p + k);
			}
			average = total / l;
			total = 0;
			for (k = 0;k < l;k++)
			{
				total += (*(p + k) - average) * (*(p + k) - average);
			}
			s = Math.sqrt(total / l);
			System.out.printf("%.5lf",s);
			System.out.print("\n");
			total = 0;
		}
	}
}

