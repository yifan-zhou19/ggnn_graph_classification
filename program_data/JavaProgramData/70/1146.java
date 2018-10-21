package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  double d = 0;
		  double s;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int m;
		  m = n * (n - 1) / 2;
		  double[] a = new double[n];
		  double[] b = new double[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p=(double *)malloc(m *sizeof(double));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  double p = (double)malloc(m * (Double.SIZE / Byte.SIZE));
		  int i;
		  int j;
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Double.parseDouble(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b[i] = Double.parseDouble(tempVar3);
						  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
		  for (j = i + 1;j < n;j++)
		  {
							s = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
						  if (s > d)
						  {
						  d = s;
						  }
		  }
		  }
		  System.out.printf("%.4f",d);


	}
}

