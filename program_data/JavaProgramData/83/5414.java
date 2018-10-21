package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double GPA;
	double a = 0;
	double b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double[] x = new double[10];
	double[] cj = new double[MAX];
	double[] jd = new double[MAX];
	double[] zjd = new double[MAX];
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
	  a += x[i];
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		cj[i] = Double.parseDouble(tempVar3);
	}
	   if ((cj[i] >= 90) && (cj[i] <= 100))
	   {
		  jd[i] = 4.0;
		  zjd[i] = jd[i] * x[i];
	   }
	 else if ((cj[i] < 90) && (cj[i] >= 85))
	 {
		  jd[i] = 3.7;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] <= 84) && (cj[i] >= 82))
	 {
		  jd[i] = 3.3;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] <= 81) && (cj[i] >= 78))
	 {
		  jd[i] = 3.0;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] < -77) && (cj[i] >= 75))
	 {
		  jd[i] = 2.7;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] <= 74) && (cj[i] >= 72))
	 {
		  jd[i] = 2.3;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] <= 71) && (cj[i] >= 68))
	 {
		  jd[i] = 2.0;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] <= 67) && (cj[i] >= 64))
	 {
		  jd[i] = 1.5;
		  zjd[i] = jd[i] * x[i];
	 }
	 else if ((cj[i] <= 63) && (cj[i] >= 60))
	 {
		  jd[i] = 1.0;
		  zjd[i] = jd[i] * x[i];
	 }
	 else
	 {
		  zjd[i] = 0;
	 }
	}
	for (i = 0;i < n;i++)
	{
	   b += zjd[i];
	}
		 GPA = 1.0 * b / a;
		 System.out.printf("%.2lf",GPA);
		 return 0;
	}
}

