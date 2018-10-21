package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 double a;
	 double b = 0;
	 double[] sz = new double[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < m;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 b = 0;
		 for (j = 0;j <= n;j++)
		 {
			 sz[0] = 1;
			 sz[1] = 2;
			 if (j == 0)
			 {
				 a = 2;
			 }
			 else if (j == 1)
			 {
				 a = 1.5;
			 }
				  else
				  {
				   sz[j] = sz[j - 2] + sz[j - 1];
				  }

		 }
		 for (j = 0;j < n;j++)
		 {
				   a = sz[j + 1] / sz[j];
				   b = b + a;
		 }
		 System.out.printf("%.3lf\n",b);
	 }
	return 0;
	}
}

