package <missing>;

public class GlobalMembers
{
	/*?? - ??(13.7) ????   
	 ?? POJ 2693?PG1009 
	?? 
	?????(x,y)????????????????
	 ???? 
	??????n?n????2? 
	?????????????????x y???
	 ???? 
	??????????????? 
	 ???? 
	6
	34.0 23.0
	28.1 21.6
	14.7 17.1
	17.0 27.2
	34.7 67.1
	29.3 65.1
	 ???? 
	53.8516
	 ?? 
	????????????double???????? 
	??printf("%.4f\n", dis)?????????????4?? 
	*/
	public static void Main()
	{
		int n;
		int i;
		int j;
		double max;
		double a;
		double[] x = new double[10];
		double[] y = new double[10];
		double[] s = new double[10];
		double f = new double(double,double,double,double);
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			s[i] = f(x[i], y[i], x[i + 1], y[i + 1]);
			if (i < n - 2)
			{
			for (j = i + 2;j < n;j++)
			{
				a = f(x[i], y[i], x[j], y[j]);
				if (s[i] < a)
				{
					s[i] = a;
				}
			}
			}
		}
		max = s[0];
		for (i = 1;i < n;i++)
		{
			if (max < s[i])
			{
				max = s[i];
			}
		}
		System.out.printf("%.4f\n", max);
	}

	public static double f(double x1,double y1,double x2,double y2)
	{
		double z;
		z = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return z;
	}

}

