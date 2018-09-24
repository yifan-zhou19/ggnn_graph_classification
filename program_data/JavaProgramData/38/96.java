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
		int i;
		int[] n = new int[1000];
		int j;
		int m;
		double[] x = new double[1000];
		double sum = 0;
		double aver;
		double total = 0;
		double out;
		for (i = 1;i <= k;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 n[i] = tempVar2;
						 }
						 for (j = 1;j <= n[i];j++)
						 {
											 String tempVar3 = ConsoleInput.scanfRead();
											 if (tempVar3 != null)
											 {
												 x[j] = tempVar3;
											 }
											 sum = sum + x[j];
						 }
						 aver = (double)sum / n[i];
						 for (m = 1;m <= n[i];m++)
						 {
											 total = total + (aver - x[m]) * (aver - x[m]);
						 }
						 out = Math.sqrt(total / n[i]);
						 System.out.printf("%.5lf\n", out);
						 sum = 0;
						 total = 0;
		}
		return 0;
	}


}

