package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int i;
		 int[] a = new int[100];
		 int[] b = {0, 0, 0, 0};
		 double[] c = new double[4];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		 if (a[i] >= 1 && a[i] <= 18)
		 {
			 b[0]++;
		 }
		 else if (a[i] >= 19 && a[i] <= 35)
		 {
			 b[1]++;
		 }
		 else if (a[i] >= 36 && a[i] <= 60)
		 {
			 b[2]++;
		 }
		 else
		 {
			 b[3]++;
		 }
		 }
		 for (i = 0;i < 4;i++)
		 {
			 //printf("%d\t",b[i]);
			 c[i] = (double)b[i] / n * 100;
		 }
		 System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",c[0],c[1],c[2],c[3]);
		 return 0;
	 }





}

