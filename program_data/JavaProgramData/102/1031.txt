package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[40];
		double[] b = new double[40];
		double[] c = new double[40];
		double q;
		char[][] xb = new char[40][10];
		final String str1 = "male";
		final String str2 = "female";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int t = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 xb[i] = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 c[i] = Double.parseDouble(tempVar3);
						 }
						 if (strcmp(xb[i],str1) == 0)
						 {
										   a[k] = c[i];
										   k++;
						 }
						 if (strcmp(xb[i],str2) == 0)
						 {
											 b[t] = c[i];
											 t++;
						 }
		}
		for (i = 1;i < k;i++)
		{
						 for (j = 0;j < k - i;j++)
						 {
											if (a[j] > a[j + 1])
											{
															q = a[j];
															a[j] = a[j + 1];
															a[j + 1] = q;
											}
						 }
		}
		 for (i = 1;i < t;i++)
		 {
						 for (j = 0;j < t - i;j++)
						 {
											if (b[j] < b[j + 1])
											{
															q = b[j];
															b[j] = b[j + 1];
															b[j + 1] = q;
											}
						 }
		 }
		 for (i = 0;i < k;i++)
		 {
		 System.out.printf("%.2lf ",a[i]);
		 }
		 for (i = 0;i < t - 1;i++)
		 {
		 System.out.printf("%.2lf ",b[i]);
		 }
		 System.out.printf("%.2lf",b[t - 1]);
		 return 0;
	}




}

