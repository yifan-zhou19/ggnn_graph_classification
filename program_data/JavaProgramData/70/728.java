package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x;
		double[] y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *z;
		double z;
		double s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *s1;
		double s1;
		x = new double[n];
		y = new double[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		z = (double)malloc((Double.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s1 = (double)malloc((Double.SIZE / Byte.SIZE) * n);
		 for (i = 0;i < n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		 }
		for (i = 0;i < n;i++)
		{
			s = 0;
			for (j = i + 1;j < n;j++)
			{
				s1[j] = Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2);
				if (s1[j] > s)
				{
					s = s1[j];
				}
			z[i] = s;
			}
		}
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (z[i] > z[max])
			{
				max = i;
			}
		}
		System.out.printf("%.4lf\n",Math.sqrt(z[max]));
		return 0;
	}





}

