package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int F = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		double[] g = new double[n];
		double[] G = new double[n];
		double GPA;
		double sum = 0.00;
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 F += a[i];
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
		}
		for (i = 0;i < n;i++)
		{
			 if (b[i] < 60)
			 {
				   g[i] = 0.00;
			 }
			 else if (b[i] <= 63)
			 {
				   g[i] = 1.00;
			 }
			 else if (b[i] <= 67)
			 {
				   g[i] = 1.50;
			 }
			 else if (b[i] <= 71)
			 {
				   g[i] = 2.00;
			 }
			 else if (b[i] <= 74)
			 {
				   g[i] = 2.30;
			 }
			 else if (b[i] <= 77)
			 {
				   g[i] = 2.70;
			 }
			 else if (b[i] <= 81)
			 {
				   g[i] = 3.00;
			 }
			 else if (b[i] <= 84)
			 {
				   g[i] = 3.30;
			 }
			 else if (b[i] <= 89)
			 {
				   g[i] = 3.70;
			 }
			 else if (b[i] <= 100)
			 {
				   g[i] = 4.00;
			 }
		}
		for (i = 0;i < n;i++)
		{
			 G[i] = g[i] * a[i];
			 sum += G[i];
		}
		  GPA = sum / F;
		  System.out.printf("%.2f",GPA);
		  return 0;
	}
}

