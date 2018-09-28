package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		double s;
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
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (i = 0;i < m;i++)
		{
						 k = a[i];
						 for (j = 1;j <= k;j++)
						 {
										   b[1] = 2;
										   b[2] = 3;
										   if (j != 1 && j != 2)
										   {
												   b[j] = b[j - 1] + b[j - 2];
										   }
						 }
		}
		for (i = 0;i < m;i++)
		{
						 k = a[i];
						 for (j = 1;j <= k;j++)
						 {
										   c[1] = 1;
										   c[2] = 2;
										   if (j != 1 && j != 2)
										   {
												   c[j] = c[j - 1] + c[j - 2];
										   }
						 }
		}
		for (i = 0;i < m;i++)
		{
						 k = a[i];
						 s = 0;
						 for (j = 1;j <= k;j++)
						 {
										   s = s + b[j] * 1.0 / c[j];
						 }
						 if (i != m - 1)
						 {
							  System.out.printf("%.3lf\n",s);
						 }
						 else
						 {
							  System.out.printf("%.3lf",s);
						 }
		}
	return 0;
	}
}

