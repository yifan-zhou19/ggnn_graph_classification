package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 double[] a = new double[50000];
		 double[] b = new double[50000];
		 double k = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 1;i <= n;i++)
		 {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Double.parseDouble(tempVar3);
			  }
		 }
		 for (int i = 1;i <= n;i++)
		 {
				 for (int j = 1;j <= n;j++)
				 {
						 double s;
						 s = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]);
						 s = Math.sqrt(s);
						 if (s > k)
						 {
						 k = s;
						 }
				 }
		 }
		 System.out.printf("%.4lf",k);

	}

}

