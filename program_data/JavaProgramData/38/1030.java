package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k;
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double * x[101];
	double[] x = new double[101];
	double n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	 for (i = 0;i < k;i++)
	 {
	  double a = 0.0;
	  double s = 0.0;
	  double S;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Double.parseDouble(tempVar2);
	  }
	  for (j = 0;j < n;j++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  x[j] = (double)malloc((Double.SIZE / Byte.SIZE));
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  x[j] = Double.parseDouble(tempVar3);
	  }
	  a += x[j];
	  }
	  a = a / n;
	  for (j = 0;j < n;j++)
	  {
	  s += Math.pow((x[j] - a),2);
	  }

	  S = Math.sqrt(s / n);
	  System.out.printf("%.5f\n",S);

	 }

	}
}

