package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] m = new int[1000];
	int i;
	int j;
	int[] a = new int[1000];
	int[] b = new int[1000];
	double[] c = new double[1000];
	double[] sum = new double[1000];
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
			m[i] = Integer.parseInt(tempVar2);
		}
	}


	for (i = 0;i < n;i++)
	{
			 a[0] = 2;
			 a[1] = 3;
			 b[0] = 1;
			 b[1] = 2;


		for (j = 2;j < m[i];j++)
		{

			 a[j] = a[j - 1] + a[j - 2];


			b[j] = b[j - 1] + b[j - 2];
		}
		for (j = 0;j < m[i];j++)
		{
		c[j] = (double)a[j] / b[j];
		sum[i] += c[j];
		}


		System.out.printf("%.3lf\n",sum[i]);
	}
	return 0;
	}
}

