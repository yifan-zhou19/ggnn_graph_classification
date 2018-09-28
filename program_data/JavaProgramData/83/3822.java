package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] d = new int[n];
	int[] a = new int[n];
	double GPA;
	double k = 0;
	double y = 0;
	double[] j = new double[n];
	double[] x = new double[n];
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x[i] = Double.parseDouble(tempVar2);
	 }
	}
	for (i = 0;i < n;i++)
	{
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  d[i] = Integer.parseInt(tempVar3);
	  }
	}
	for (i = 0;i < n;i++)
	{
	  if (d[i] >= 90 && d[i] <= 100)
	  {
		 j[i] = 4.0;
	  }
	   if (d[i] >= 85 && d[i] <= 89)
	   {
		 j[i] = 3.7;
	   }
	if (d[i] >= 82 && d[i] <= 84)
	{
		 j[i] = 3.3;
	}
	if (d[i] >= 78 && d[i] <= 81)
	{
		 j[i] = 3.0;
	}
	if (d[i] >= 75 && d[i] <= 77)
	{
		 j[i] = 2.7;
	}
	if (d[i] >= 72 && d[i] <= 74)
	{
		 j[i] = 2.3;
	}
	if (d[i] >= 68 && d[i] <= 71)
	{
		 j[i] = 2.0;
	}
	if (d[i] >= 64 && d[i] <= 67)
	{
		 j[i] = 1.5;
	}
	if (d[i] >= 60 && d[i] <= 63)
	{
		 j[i] = 1.0;
	}
	if (d[i] < 60)
	{
		 j[i] = 0;
	}
	}
	for (i = 0;i < n;i++)
	{
	 k += j[i] * x[i];
	 y += x[i];
	}
	GPA = k / y;
	System.out.printf("%.2lf",GPA);
	return 0;
	}
}

