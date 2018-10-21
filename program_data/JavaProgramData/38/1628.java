package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	int[] zu = new int[k];
	double[][] x = new double[k][1000];
	int i;
	int j;
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zu[i] = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < zu[i] - 1;j++)
	{
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 x[i][j] = Double.parseDouble(tempVar3);
	 }
	}
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 x[i][zu[i] - 1] = Double.parseDouble(tempVar4);
	 }
	}
	double[] sum = new double[k];
	double[] xbar = new double[k];
	for (i = 0;i < k;i++)
	{
		sum[i] = 0;
	}
	for (i = 0;i < k;i++)
	{
	 for (j = 0;j < zu[i];j++)
	 {
		 sum[i] += x[i][j];
	 }
	 xbar[i] = sum[i] / zu[i];
	}
	double[] fc = new double[k];
	double[] a = new double[k];
	for (i = 0;i < k;i++)
	{
		a[i] = 0;
	}
	for (i = 0;i < k;i++)
	{
	 for (j = 0;j < zu[i];j++)
	 {
	   a[i] += (x[i][j] - xbar[i]) * (x[i][j] - xbar[i]);
	 }
	 fc[i] = Math.sqrt(a[i] / zu[i]);
	 System.out.printf("%.5lf\n",fc[i]);
	}
	return 0;
	}




}

