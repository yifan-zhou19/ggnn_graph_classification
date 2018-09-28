package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= m;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
			 int[] a = new int[100];
			 int[] b = new int[100];
			 double[] d = new double[100];
			 a[0] = 2;
			 b[0] = 1;
			 d[0] = (double)a[0] / b[0];
			 for (j = 1;j < n;j++)
			 {
					a[j] = a[j - 1] + b[j - 1];
					b[j] = a[j - 1];
					d[j] = (double)a[j] / b[j];
			 }
			 double c = 0.0000000;
			 for (j = 0;j < n;j++)
			 {
				  c = c + d[j];
			 }
			System.out.printf("%.3lf\n",c);
		}
	}

}

