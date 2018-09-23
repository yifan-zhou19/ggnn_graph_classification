package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
		int l = 0;
		int p;
		char[][] a = new char[100][10];
		double[] f = new double[100];
		double[] m = new double[100];
		double e;
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
							a[i] = tempVar2.charAt(0);
						}
						if (a[i][0] == 'm')
						{
										String tempVar3 = ConsoleInput.scanfRead();
										if (tempVar3 != null)
										{
											m[k] = Double.parseDouble(tempVar3);
										}
										k++;
						}
						else if (a[i][0] == 'f')
						{
							 String tempVar4 = ConsoleInput.scanfRead();
							 if (tempVar4 != null)
							 {
								 f[l] = Double.parseDouble(tempVar4);
							 }
							 l++;
						}
		}
		for (i = 1;i <= k;i++)
		{
						 for (p = 0;p < k - i;p++)
						 {
										   if (m[p] > m[p + 1])
										   {
														e = m[p + 1];
														m[p + 1] = m[p];
														m[p] = e;
										   }
						 }
		}
		for (i = 1;i <= l;i++)
		{
						 for (p = 0;p < l - i;p++)
						 {
										   if (f[p] < f[p + 1])
										   {
														e = f[p + 1];
														f[p + 1] = f[p];
														f[p] = e;
										   }
						 }
		}
		for (i = 0;i < k;i++)
		{
						if (i == 0)
						{
						System.out.printf("%.2lf",m[i]);
						}
						else
						{
						System.out.printf(" %.2lf",m[i]);
						}
		}
		for (i = 0;i < l;i++)
		{
						System.out.printf(" %.2lf",f[i]);
		}
		return 0;
	}
}

