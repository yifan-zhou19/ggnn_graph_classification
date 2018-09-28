package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[][] x = new double[100][1000];
		double a;
		double[] s = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *px;
		double px;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *ps;
		double ps;
		px = x[0];
		ps = s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			a = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					((px + i) + j) = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n;j++)
			{
				a = a + *((px + i) + j);
			}
			a = a / n;
			for (j = 0;j < n;j++)
			{
				*(ps + i) = *(ps + i) + (*((px + i) + j) - a) * (*((px + i) + j) - a);
			}
			*(ps + i) = *(ps + i) / n;
			*(ps + i) = Math.sqrt(*(ps + i));
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",*(ps + i));
		}
		return 0;
	}
}

