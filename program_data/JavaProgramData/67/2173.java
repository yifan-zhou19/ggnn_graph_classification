package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 double k;
	 double m;
	 double t;
	 double[][] a = new double[100][2];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < 2;j++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i][j] = Double.parseDouble(tempVar2);
			 }
		 }
	 }
	 k = a[0][1] / a[0][0];

	 for (i = 1;i < n;i++)
	 {
		 if ((k - a[i][1] / a[i][0]) > 0.05)
		 {
			 System.out.print("worse\n");
		 }
		  else if ((a[i][1] / a[i][0] - k) > 0.05)
		  {
			  System.out.print("better\n");
		  }
		  else
		  {
			  System.out.print("same\n");
		  }
	 }
	 return 0;
	}
}

