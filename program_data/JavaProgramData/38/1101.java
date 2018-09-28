package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[50]={0};
		double[] p = new double[50];
		for (i = 0;i < n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *x;
			double x;
			double sum = 0;
			for (j = 0;j < m;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				x = (double)malloc((Double.SIZE / Byte.SIZE));
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Double.parseDouble(tempVar3);
				}
				p[j] = x;
				sum += x;
			}
			double a;
			double c = 0;
			a = sum / m;
			for (j = 0;j < m;j++)
			{
				c += (p[j] - a) * (p[j] - a);
			}
			c = c / m;
			double s;
			s = Math.sqrt(c);
			System.out.printf("%.5lf\n",s);
		}
	}
}

