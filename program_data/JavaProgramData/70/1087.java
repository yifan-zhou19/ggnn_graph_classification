public class area
{
	   public double x;
	   public double y;
}

package <missing>;

public class GlobalMembers
{
	public static area[] a = tangible.Arrays.initializeWithDefaultareaInstances(101);
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 float[] b = new float[101];
		 float d;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i].x = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i].y = Double.parseDouble(tempVar3);
			  }
		 }
		 d = Math.sqrt((a[2].x - a[1].x) * (a[2].x - a[1].x) + (a[2].y - a[1].y) * (a[2].y - a[1].y));
		 for (i = 2;i <= n;i++)
		 {
			 b[i] = Math.sqrt((a[i].x - a[1].x) * (a[i].x - a[1].x) + (a[i].y - a[1].y) * (a[i].y - a[1].y));
			 for (j = 2;j < i;j++)
			 {
				  if (Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y)) > b[i])
				  {
					   b[i] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y));
				  }
			 }
		 }
		 for (i = 2;i <= n;i++)
		 {
		 if (b[i] > d)
		 {
		 d = b[i];
		 }
		 }
		 System.out.printf("%.4lf\n",d);
	}
}

