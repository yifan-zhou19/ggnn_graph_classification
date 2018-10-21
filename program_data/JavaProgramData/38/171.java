package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pi', so pointers on this parameter are left unchanged:
	public static double fangcha(double * pi, int n)
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *pa;
		double pa;
		pa = pi;
	//	printf("hanshu%lf\n",*pi);
		double sum = 0;
		double ave;
		for (i = 0;i < n;i++)
		{
			sum += *pi;
			pi++;
		}
		ave = sum / n;
	//	printf("hanshuave=%lf\n",ave);
		double s = 0;
		for (i = 0;i < n;i++)
		{
			s += ((pa - ave) * (pa - ave));
			pa++;
	//		printf("hanshuzhongs1=%lf\n",s);
		}
	//	printf("hanshuzhongs1=%lf\n",s);
		s = s / (double)n;
	//	printf("hanshuzhongs2=%lf\n",s);
		s = Math.sqrt(s);
		return s;
	}
	public static int Main()
	{
		int k;
		int i;
		int j;
		double[][] x = new double[100][100];
		int[] b = new int[100];
		double[] xx = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
	//	printf("%d",k);
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < b[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
		//		printf("%lf")
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *pi;
		double pi;
		for (i = 0;i < k;i++)
		{
			pi = x[i][0];
	//		printf("waiwei%lf\n",*pi);
			xx[i] = fangcha(pi, b[i]);
			System.out.printf("%.5f\n",xx[i]);
		}
		return 0;
	}
}

