public class spot
{
	public double x;
 public double y;
}

package <missing>;

public class GlobalMembers
{
		   public static spot[] a = tangible.Arrays.initializeWithDefaultspotInstances(100);
	 public static int Main()
	 {
		 int i;
		 int j;
		 int n;
		 double t = 0;
		 double m;
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
				 a[i].x = Double.parseDouble(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i].y = Double.parseDouble(tempVar3);
			 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = n - 1;j > i;j--)
			 {
				if (((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y)) > t)
				{
			  t = (a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y);
				}
			 }
		 }
		  System.out.printf("%.4lf", Math.sqrt(t));
		  return 0;
	 }
}

