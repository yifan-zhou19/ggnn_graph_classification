package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int l;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100];
		double[] p = new double[100];
		double a;
		double sum = 0;
		double s = 0;
		double b;
		double c;
		double sum2 = 0;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (l = 0;l < k;l++)
		{
			a = 0;
			sum = 0;
			s = 0;
			b = 0;
			c = 0;
			sum2 = 0;
			e = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p[j] = (double) malloc(100 * (Double.SIZE / Byte.SIZE));
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] = tempVar3;
				}
				sum = sum + p[j];
			}
			a = sum / n;
			for (j = 0;j < n;j++)
			{
				b = p[j] - a;
				c = b * b;
				sum2 = sum2 + c;
			}
			e = sum2 / n;
			s = Math.sqrt(e);
			System.out.printf("%.5f\n",s);
		}
	}




}

