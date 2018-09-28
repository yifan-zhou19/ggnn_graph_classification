package <missing>;

public class GlobalMembers
{
	public static double max(tangible.RefObject<Double> p1, tangible.RefObject<Double> p2, int n)
	{
		int i;
		int j;
		double c;
		double max = 0;
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (max < (c = Math.sqrt((*(p1.argValue + i) - *(p1.argValue + j)) * (*(p1.argValue + i) - *(p1.argValue + j)) + (*(p2.argValue + i) - *(p2.argValue + j)) * (*(p2.argValue + i) - *(p2.argValue + j)))))
				{
					max = c;
				}
			}
		}
		return max;
	}
	public static void Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p1,*p2,x[100],y[100];
		double p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p2;
		double p2;
		double[] x = new double[100];
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		p1 = x[0];
		p2 = y[0];
	tangible.RefObject<Double> tempRef_p1 = new tangible.RefObject<Double>(p1);
	tangible.RefObject<Double> tempRef_p2 = new tangible.RefObject<Double>(p2);
		System.out.printf("%.4lf",max(tempRef_p1, tempRef_p2, n));
		p2 = tempRef_p2.argValue;
		p1 = tempRef_p1.argValue;
	}


}

