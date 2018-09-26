package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int isrunnian(int year);
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double[] b = new double[1000];
		double sum = 0.0;
		double s = 0.0;
		double a = 0.0;
		double s2 = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			s2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				sum += b[j];
			}
			a = (double)sum / m;
			for (j = 0;j < m;j++)
			{
				s2 += (b[j] - a) * (b[j] - a);
			}
			s = Math.sqrt(s2 / m);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}

}

