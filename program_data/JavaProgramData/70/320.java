package <missing>;

public class GlobalMembers
{
	public static double juli(double m,double n,double x,double y)
	{
		 double z;
		 z = Math.sqrt((m - x) * (m - x) + (n - y) * (n - y));
		 return (z);
	}
	public static void Main()
	{
		 int i;
		 int j;
		 int t;
		 double[][] a = new double[20][2];
		 double c = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < t;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		 }
		 for (i = 0;i < t - 1;i++)
		 {
		 for (j = i + 1;j < t;j++)
		 {
		  if (juli(a[i][0], a[i][1], a[j][0], a[j][1]) >= c)
		  {
			 c = juli(a[i][0], a[i][1], a[j][0], a[j][1]);
		  }
		 }
		 }
		  System.out.printf("%.4lf",c);
	}

}

