package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] n = new int[200];
	 int i;
	 int j;
	 int k;
	 double a = 0;
	 double[] x = new double[200];
	 double s = 0;
	 double w = 0;
	 double[] sum = new double[200];

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
			 n[j] = Integer.parseInt(tempVar2);
		 }
		 s = 0;
		 w = 0;
		 a = 0;

		 for (i = 0;i < n[j];i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 x[i] = Double.parseDouble(tempVar3);
			 }
			 s = s + x[i];

		 }
			 a = s / n[j];
		 for (i = 0;i < n[j];i++)
		 {
			w = w + ((x[i] - a) * (x[i] - a));
			 sum[j] = Math.sqrt(w / n[j]);
		 }
	 }
	 for (j = 0;j < k;j++)
	 {

		 System.out.printf("%.5lf\n",sum[j]);
	 }

		return 0;
	}
}

