package <missing>;

public class GlobalMembers
{
	public static double[] male = new double[41];
	public static double[] female = new double[41];


	public static int compare(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double* p1=(double*)e1;
		double p1 = (double)e1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double* p2=(double*)e2;
		double p2 = (double)e2;
		if (p1 < p2)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}


	public static int Main()
	{
		int nCase;
		int i;
		int f = 0;
		int m = 0;
		String sex = new String(new char[10]);
		double height;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nCase = Integer.parseInt(tempVar);
		}
		for (i = 0;i < nCase;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				height = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				male[m] = height;
				m++;
			}
			else
			{
				female[f] = height;
				f++;
			}
		}


		qsort(male,m,(Double.SIZE / Byte.SIZE),compare);
		qsort(female,f,(Double.SIZE / Byte.SIZE),compare);


		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (i = f - 1;i > 0;i--)
		{
			System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f\n",female[0]);
		return 0;
	}
}

