package <missing>;

public class GlobalMembers
{
	public static double average(double[][] data, int n)
	{
	double sum = 0;
	double a;
	int i;
	for (i = 0;i < n;i++)
	{
	  sum += data[i];
	}
	//printf("sum=%lf",sum);
	a = sum / n;
	return a;
	}

	public static double S(double[][] data, int n, double a)
	{
	double sum = 0;
	double root;
	int i;
	for (i = 0;i < n;i++)
	{
	 sum += (data[i] - a) * (data[i] - a);
	}
	//printf("sum=%lf",sum);
	root = Math.sqrt(sum / n);
	return root;
	}

	public static void Main()
	{
	int k;
	int i;
	int n;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *temp,a,s,*data[100];
	double temp;
	double a;
	double s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *data[100];
	double[] data = new double[100];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}

		 for (j = 0;j < k;j++)
		 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }


	  for (i = 0;i < n;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   temp = (double)malloc((Double.SIZE / Byte.SIZE));
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  temp = Double.parseDouble(tempVar3);
		  }
		  data[i] = temp;
	  }
	  a = average(data, n);

	  s = S(data, n, a);
	  System.out.printf("%.5f\n",s);
		 }

	}
}

