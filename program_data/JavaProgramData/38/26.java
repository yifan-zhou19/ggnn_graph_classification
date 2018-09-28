package <missing>;

public class GlobalMembers
{
	// 100001.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{

		int n;
		int k;
		int j;
		int i;
		double sum;
		double sum1;
		double S;
		double s;
		double mean;
		double[] a = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double* p;
		double p;
		p = a;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0; i < k; i++)
		{
			sum = 0;
			sum1 = 0;


			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			for (j = 0; j < n; j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + j = Double.parseDouble(tempVar3);
			}
			}

			for (j = 0; j < n; j++)
			{
			sum += *(p + j);
			}

			mean = sum / n;

			for (j = 0; j < n; j++)
			{
			sum1 += (*(p + j) - mean) * (*(p + j) - mean);
			}

			S = sum1 / n;

			s = Math.sqrt(S);

	System.out.printf("%.5lf\n", s);




		}




		return 0;
	}
}

