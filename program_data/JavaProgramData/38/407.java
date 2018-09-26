package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int t;
		int m;
		double a;
		double s;
		double shu;
		double[] p;
		double[] sm;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		p = new double[101];
		sm = new double[k];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shu = Double.parseDouble(tempVar2);
			}
			p[0] = shu;
			a = 0;
			for (j = 1;j <= p[0];j++)
			{
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 p[j] = Double.parseDouble(tempVar3);
				 }
				 a += p[j];
			}
			a = a / p[0];
			s = 0;
			for (t = 1;t <= p[0];t++)
			{
				s += (p[t] - a) * (p[t] - a);
			}
			s = s / p[0];
			s = Math.sqrt(s);
			sm[i] = s;
		}
		for (m = 0;m < k;m++)
		{
			System.out.printf("%.5lf\n",sm[m]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sm);
		return 0;
	}
}

