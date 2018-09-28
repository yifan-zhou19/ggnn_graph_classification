package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int[] a = new int[1000];
	 double[] k = new double[1000];
	 int m;
	 int q;
	 int i;
	 int shumu;
	 for (i = 0;i < 1000;i++)
	 {
		 if (i == 0)
		 {
			 a[0] = 1;
		 }
		 else
		 {
			 if (i == 1)
			 {
				 a[i] = 2;
			 }
			 else
			 {
				 a[i] = a[i - 1] + a[i - 2];
			 }
		 }
	 }

	 double zhi;
	 double sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (q = 0;q < m;q++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 shumu = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < shumu;i++)
		 {
			 zhi = 1.0 * a[i + 1] / a[i];
			 sum += zhi;
		 }
		 k[q] = sum;
		 sum = 0;
	 }
	 for (i = 0;i < m;i++)
	 {
		 System.out.printf("%.3lf\n",k[i]);
	 }

	}




}

