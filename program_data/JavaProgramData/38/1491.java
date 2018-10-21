package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		double a;
		double s;
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
				m = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
			double p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (double)calloc(m,(Double.SIZE / Byte.SIZE));
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = Double.parseDouble(tempVar3);
				}
			}
			/*?????%d?????%lf*/
			double aver = new double(double * p1,int l);
			tangible.RefObject<Double> tempRef_p = new tangible.RefObject<Double>(p);
				a = aver(tempRef_p, m);
				p = tempRef_p.argValue;
			double ss = new double(double * p2,double x,int k);
			tangible.RefObject<Double> tempRef_p2 = new tangible.RefObject<Double>(p);
				s = ss(tempRef_p2, a, m);
				p = tempRef_p2.argValue;
			System.out.printf("%.5lf\n",s);
			/*????%.5f??%.5lf*/
		}
	}

	public static double aver(tangible.RefObject<Double> p1, int l)
	{
		double s1 = 0;
		int i;
		for (i = 0;i < l;i++)
		{
			s1 += *(p1.argValue + i);
		}
		return (s1 / l);
	}

	public static double ss(tangible.RefObject<Double> p2, double x, int k)
	{
		double s2 = 0;
		int i;
		for (i = 0;i < k;i++)
		{
			s2 += Math.pow((*(p2.argValue + i) - x),2);
		}
		return (Math.sqrt(s2 / k));
	}

}

