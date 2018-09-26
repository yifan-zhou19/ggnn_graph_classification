package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 double[] sx = new double[100];
	 double[] sy = new double[100];
	 double[] sz = new double[100];
	 double[] s = new double[100];
	 sz[0] = 2;
	 sx[0] = 2;
	 sy[0] = 1;
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


	 for (j = 1;j < n;j++)
	 {
		 sy[j] = sx[j - 1];
	 sx[j] = sx[j - 1] + sy[j - 1];

	 sz[j] = sz[j - 1] + sx[j] / sy[j];

	 }
	  s[i] = sz[n - 1];
	 }


	 for (i = 0;i < m;i++)
	 {
	 System.out.printf("%.3lf\n",s[i]);
	 }


	 return 0;
	}

}

